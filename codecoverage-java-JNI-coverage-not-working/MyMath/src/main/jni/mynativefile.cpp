//my first native file
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jint JNICALL
Java_com_sample_mathlub_MathLib_native_1add1(JNIEnv *env, jobject thiz, jint x, jint y) {
    // TODO: implement native_add1()

    int result=0;
    result = x+y;
    result++;
    result++;
    result++;
    result++;
    result++;
    result++;
    result++;
    result++;
    result++;
    result++;
    result=result * 10;

    return result;
}