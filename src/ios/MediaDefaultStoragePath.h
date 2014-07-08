#import <Foundation/Foundation.h>
#import <Cordova/CDV.h>

@interface MediaDefaultStoragePath : CDVPlugin

- (void) getDefaultStoragePath:(CDVInvokedUrlCommand*)command;

@end

