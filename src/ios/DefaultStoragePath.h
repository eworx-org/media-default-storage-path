#import <Foundation/Foundation.h>
#import <Cordova/CDV.h>

@interface DefaultStoragePath : CDVPlugin

- (void) getDefaultStoragePath:(CDVInvokedUrlCommand*)command;

@end

