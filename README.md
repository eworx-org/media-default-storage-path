media-default-storage-path
====================

This is a utility plugin regarding the [Cordova Media Plugin](https://github.com/apache/cordova-plugin-media). It provides a helper method that returns the absolute path of the directory where the Cordova media recorder saves recordings by default, if the recorder object is constructed given a simple file name, with no uri schema.

A typical example of such a case is the following:

```javascript
var recorder = new Media('myFile.wav');
recorder.startRecord();
```

To find out the absolute path of the recording:

```javascript
var util = new MediaDefaultStoragePath();
var dir = util.getDefaultStoragePath();
var filePath = dir + '/myFile.wav';
```

This plugin currently supports **Android** and **iOS**

