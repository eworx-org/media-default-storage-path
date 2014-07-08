package gr.eworx.storage;

import android.os.Environment;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public final class MediaDefaultStoragePath extends CordovaPlugin {
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("getDefaultStoragePath".equals(action)) {
            this.handleGetDefaultStorageLocation(callbackContext);
            return true;
        }
        
        return false;
    }
    
    private void handleGetDefaultStorageLocation(CallbackContext callbackContext) {
        String path = this.getDefaultStoragePath();
        PluginResult result = new PluginResult(PluginResult.Status.OK, path);
        callbackContext.sendPluginResult(result);
    }
    
    private String getDefaultStoragePath() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        } 
        else {
            return "/data/data/" + this.cordova.getActivity().getPackageName();
        }
    }
}
