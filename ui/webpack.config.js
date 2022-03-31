const path = require('path');
const CopyPlugin = require('copy-webpack-plugin');
const ModuleFederationPlugin = require('webpack/lib/container/ModuleFederationPlugin');
const pjson = require('./package.json');

const pluginName = pjson.name;

const config = {
  entry: './src',
  output: {
    path: path.resolve(__dirname, 'build'), // change to 'build/public' to allow public access to resources
    publicPath: 'auto',
    clean: true,
  },
  resolve: {
    extensions: ['.js', '.jsx', '.json', '.sass', '.scss', '.css'],
    alias: {
      components: path.resolve(__dirname, 'src/components'),
      constants: path.resolve(__dirname, 'src/constants'),
      icons: path.resolve(__dirname, 'src/icons'),
      hooks: path.resolve(__dirname, 'src/hooks'),
      utils: path.resolve(__dirname, 'src/utils'),
    },
  },
  module: {
    rules: [
      {
        test: /\.(sa|sc)ss$/,
        exclude: /node_modules/,
        use: [
          'style-loader',
          {
            loader: 'css-loader',
            options: {
              modules: {
                localIdentName: `${pluginName}_[name]__[local]--[hash:base64:5]`,
              },
            },
          },
          'sass-loader',
          {
            loader: 'sass-resources-loader',
            options: {
              resources: path.resolve(__dirname, './src/common/css/variables.scss'),
            },
          },
        ],
      },
      {
        test: /\.(js|jsx)$/,
        use: 'babel-loader',
        exclude: /node_modules/,
      },
      {
        test: /\.svg$/,
        loader: 'svg-inline-loader',
      },
    ],
  },
  plugins: [
    new ModuleFederationPlugin({
      name: 'example_plugin',
      filename: `remoteEntity.js`,
      shared: {
        react: {
          import: 'react',
          shareKey: 'react',
          shareScope: 'default',
          singleton: true,
        },
        'react-dom': {
          singleton: true,
        },
        'react-redux': {
          singleton: true,
        },
      },
      exposes: {
        './examplePluginTab': './src/components/examplePluginTab',
        './integrationSettings': './src/components/integrationSettings',
        './integrationFormFields': './src/components/integrationFormFields',
      },
    }),
    new CopyPlugin({
      patterns: [{ from: path.resolve(__dirname, './src/metadata.json') }],
    }),
  ],
};

module.exports = config;
