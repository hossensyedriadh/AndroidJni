LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

#module name should be the same as the file name
LOCAL_MODULE := native

#file name with extension c/cpp
LOCAL_SRC_FILES := native.c

LOCAL_ARM_MODE := arm

include $(BUILD_SHARED_LIBRARY)