# This repository is outdated and marked as public archive, use [plugin-template](https://github.com/reportportal/plugin-template) repository as a start for your plugin.

# Plugin example for Report Portal

## UI
Preconditions:
- Install Node.js version ≥ 12.

Install the dependencies: `npm install`

Run in dev mode: 
```bash
npm run dev # Run webpack in dev watch mode
npm run start # Serve built files
```

_Available only from RP v5.8_: use
```javascript
window.RP.overrideExtension(pluginName, url);
```
to override the plugin UI assets in favor of your local development changes, f.e.
```javascript
window.RP.overrideExtension('example', 'http://localhost:9090');
```

Build the UI source code: `npm run build`

**How it works**: [UI plugin docs](https://github.com/reportportal/service-ui/blob/5.4.1/app/docs/14-plugins.md).

## Build the plugin

Preconditions:
- Install JDK version 11.
- Specify version number in gradle.properties file.

Build the plugin: `gradlew build`
