#include "com_qianyy_Main.h"
#include <iostream>
using namespace std;

JNIEXPORT void JNICALL Java_com_qianyy_Main_sayHello(JNIEnv *env, jobject obj, jstring str) {
    const char* cstr = env->GetStringUTFChars(str, NULL);
    cout << cstr << endl;
    env->ReleaseStringUTFChars(str, cstr);
}