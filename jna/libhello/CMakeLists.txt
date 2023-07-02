cmake_minimum_required(VERSION 3.4)
project(hello)

set(CMAKE_CXX_STANDARD 17)

find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})

# 添加需要编译的源文件
add_library(hello SHARED com_qianyy_Main.cpp)
# 链接 JNI 库
target_link_libraries(hello ${JNI_LIBRARIES})
