cmake_minimum_required(VERSION 3.4.1)

add_library(mathlib1 SHARED
            mynativefile.cpp)
target_link_libraries(mathlib1
                      android
                      log)
