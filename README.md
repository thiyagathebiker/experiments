# experiments


##Experimental run:



```sh
D:\temp\experiments\codecoverage-java-coverage-working> .\gradlew :mathlub:jacocoTestReport
```

Starting a Gradle Daemon, 1 stopped Daemon could not be reused, use --status for details

BUILD SUCCESSFUL in 41s
15 actionable tasks: 15 executed
D:\temp\experiments\codecoverage-java-coverage-working> cd ..
D:\temp\experiments> ls


Directory: D:\temp\experiments


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----        08-08-2021  06:47 AM                codecoverage-java-coverage-working
d-----        08-08-2021  06:45 AM                codecoverage-java-JNI-coverage-not-working








D:\temp\experiments> cd .\codecoverage-java-JNI-coverage-not-working\



```sh
D:\temp\experiments\codecoverage-java-JNI-coverage-not-working> .\gradlew :MyMath:jacocoTestReport
```

Starting a Gradle Daemon, 1 busy and 3 stopped Daemons could not be reused, use --status for details

> Configure project :MyMath
WARNING:: Mapping new ns http://schemas.android.com/repository/android/common/02 to old ns http://schemas.android.com/repository/android/common/01
Mapping new ns http://schemas.android.com/repository/android/common/02 to old ns http://schemas.android.com/repository/android/common/01
WARNING:: Mapping new ns http://schemas.android.com/repository/android/generic/02 to old ns http://schemas.android.com/repository/android/generic/01
Mapping new ns http://schemas.android.com/repository/android/generic/02 to old ns http://schemas.android.com/repository/android/generic/01
WARNING:: Mapping new ns http://schemas.android.com/sdk/android/repo/addon2/02 to old ns http://schemas.android.com/sdk/android/repo/addon2/01
Mapping new ns http://schemas.android.com/sdk/android/repo/addon2/02 to old ns http://schemas.android.com/sdk/android/repo/addon2/01
WARNING:: Mapping new ns http://schemas.android.com/sdk/android/repo/repository2/02 to old ns http://schemas.android.com/sdk/android/repo/repository2/01
Mapping new ns http://schemas.android.com/sdk/android/repo/repository2/02 to old ns http://schemas.android.com/sdk/android/repo/repository2/01
WARNING:: Mapping new ns http://schemas.android.com/sdk/android/repo/sys-img2/02 to old ns http://schemas.android.com/sdk/android/repo/sys-img2/01
Mapping new ns http://schemas.android.com/sdk/android/repo/sys-img2/02 to old ns http://schemas.android.com/sdk/android/repo/sys-img2/01

> Task :MyMath:testDebugUnitTest

com.sample.mathlub.MathLibTest > p_test_addInt FAILED
    java.lang.UnsatisfiedLinkError at MathLibTest.java:10

1 test completed, 1 failed

> Task :MyMath:testDebugUnitTest FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':MyMath:testDebugUnitTest'.
> There were failing tests. See the report at: file:///D:/temp/experiments/codecoverage-java-JNI-coverage-not-working/MyMath/build/reports/tests/testDebugUnitTest/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 48s
19 actionable tasks: 17 executed, 2 up-to-date
PS D:\temp\experiments\codecoverage-java-JNI-coverage-not-working>
