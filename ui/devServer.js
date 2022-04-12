const http = require('http');
const staticServer = require('node-static');

const contentPath = './build';
const headers = {
  'Access-Control-Allow-Origin': '*',
  'Access-Control-Allow-Methods': '*',
  'Access-Control-Allow-Headers': '*',
  'Cache-Control': 'no-cache, no-store, must-revalidate',
};
const file = new staticServer.Server(contentPath, { headers });

http
  .createServer(function(req, res) {
    console.log(`Request URL: ${req.url}`);
    file.serve(req, res);
  })
  .listen(9090, () => {
    console.log(`Serving files from ${contentPath}`);
  });
