
var exec = require('cordova/exec');

var MediaDefaultStoragePath = function() {
    if (!(this instanceof MediaDefaultStoragePath)) {
        return new MediaDefaultStoragePath();
    }
};

MediaDefaultStoragePath.prototype.getDefaultStoragePath = function(successCallback, errorCallback) {
    exec(successCallback, errorCallback, "MediaDefaultStoragePath", "getDefaultStoragePath", []);
};

module.exports = MediaDefaultStoragePath;

