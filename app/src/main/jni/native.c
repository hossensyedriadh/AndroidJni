//
// Created by riadh on 3/4/2021.
//

#include<stdint.h>
#include<jni.h>
#include<stdlib.h>
#include<string.h>

JNIEXPORT jstring JNICALL
//naming standard: Java(directory)_io_github_hossensyedriadh(project package)_Test(applicaiton package)_MainActivity(activity name)_getURL(method name)
Java_io_github_hossensyedriadh_Test_MainActivity_getURL(JNIEnv *env, jobject instance) {
    return (*env) -> NewStringUTF(env, "https://github.com/hossensyedriadh");
}