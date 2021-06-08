import { ExamplePluginTab } from 'components/examplePluginTab';

window.RP.registerPlugin({
  name: 'example',
  extensions: [
    {
      name: 'example',
      title: 'Example plugin',
      type: 'uiExtension:settingsTab',
      component: ExamplePluginTab,
    },
  ],
});
