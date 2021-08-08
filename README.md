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
D:\temp\experiments\codecoverage-java-JNI-coverage-not-working> .\gradlew :mathlub:jacocoTestReport
```
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

FAILURE: Build failed with an exception.

* What went wrong:
Project 'mathlub' not found in root project 'LibraryUnitTestExample'.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 5s
PS D:\temp\experiments\codecoverage-java-JNI-coverage-not-working>
