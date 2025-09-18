# groovy-v500-graalvm-test

- For https://github.com/apache/shardingsphere/issues/29052 and I opened https://github.com/oracle/graal/issues/10200 .
- Verified unit test under Ubuntu 22.04.4 LTS with `SDKMAN!`.

```shell
sdk install java 25-graalce

git clone git@github.com:linghengqian/groovy-v500-graalvm-test.git
cd ./groovy-v500-graalvm-test/
sdk use java 25-graalce
./mvnw -PnativeTestCustom -e -T 1C clean test
```

- The log is as follows.

```shell
PS D:\TwinklingLiftWorks\git\public\groovy-v500-graalvm-test> ./mvnw -PnativeTestCustom -e -T 1C clean test
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::staticFieldBase has been called by com.google.inject.internal.aop.HiddenClassDefiner (file:/C:/Users/lingh/.m2/wrapper/dists/apache-maven-3.9.11/03d7e36a140982eea48e22c1dcac01d8862b2550b2939e09a0809bbc5182a5bc/lib/guice-5.1.0-classes.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.inject.internal.aop.HiddenClassDefiner
WARNING: sun.misc.Unsafe::staticFieldBase will be removed in a future release
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the MultiThreadedBuilder implementation with a thread count of 16
[INFO] 
[INFO] ----------< io.github.linghengqian:groovy-v500-graalvm-test >-----------
[INFO] Building groovy-v500-graalvm-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ groovy-v500-graalvm-test ---
[INFO] Deleting D:\TwinklingLiftWorks\git\public\groovy-v500-graalvm-test\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ groovy-v500-graalvm-test ---
[INFO] skip non existing resourceDirectory D:\TwinklingLiftWorks\git\public\groovy-v500-graalvm-test\src\main\resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ groovy-v500-graalvm-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ groovy-v500-graalvm-test ---
[INFO] skip non existing resourceDirectory D:\TwinklingLiftWorks\git\public\groovy-v500-graalvm-test\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ groovy-v500-graalvm-test ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug target 25] to target\test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ groovy-v500-graalvm-test ---
[WARNING]  Parameter 'systemProperties' is deprecated: Use systemPropertyVariables instead.
[INFO] Surefire report directory: D:\TwinklingLiftWorks\git\public\groovy-v500-graalvm-test\target\surefire-reports
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running io.github.linghengqian.SimpleTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.045 s -- in io.github.linghengqian.SimpleTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- native:0.11.0:test (test-native) @ groovy-v500-graalvm-test ---
[INFO] ====================
[INFO] Initializing project: groovy-v500-graalvm-test
[INFO] ====================
[INFO] Found GraalVM installation from GRAALVM_HOME variable.
[INFO] Downloaded GraalVM reachability metadata repository from file:/C:/Users/lingh/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.11.0/graalvm-reachability-metadata-0.11.0-repository.zip
[INFO] Executing: C:\Users\lingh\.version-fox\temp\1758124800-23880\java\bin\native-image.cmd @target\tmp\native-image-6423981942616512396.args org.graalvm.junit.platform.NativeImageJUnitLauncher
========================================================================================================================
GraalVM Native Image: Generating 'native-tests.exe.exe' (executable)...
========================================================================================================================
For detailed information and explanations on the build output, visit:
https://github.com/oracle/graal/blob/master/docs/reference-manual/native-image/BuildOutput.md
------------------------------------------------------------------------------------------------------------------------

[1/8] Initializing...                                                                                    (0.0s @ 0.13GB)
Error: Could not find target method: protected static void com.oracle.svm.polyglot.groovy.Target_org_codehaus_groovy_vmplugin_v7_IndyInterface_invalidateSwitchPoints.invalidateSwitchPoints()
------------------------------------------------------------------------------------------------------------------------
                        0.1s (3.9% of total time) in 8 GCs | Peak RSS: 864.83MB | CPU load: 7.18
========================================================================================================================
Failed generating 'native-tests.exe' after 1.7s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.822 s (Wall Clock)
[INFO] Finished at: 2025-09-18T13:01:40+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.graalvm.buildtools:native-maven-plugin:0.11.0:test (test-native) on project groovy-v500-graalvm-test: Execution of C:\Users\lingh\.version-fox\temp\1758124800-23880\java\bin\native-image.cmd @target\tmp\native-image-6423981942616512396.args org.graalvm.junit.platform.NativeImageJUnitLauncher returned non-zero result -> [Help 1]                                                                                                                                            
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.graalvm.buildtools:native-maven-plugin:0.11.0:test (test-native) on project groovy-v500-graalvm-test: Execution of C:\Users\lingh\.version-fox\temp\1758124800-23880\java\bin\native-image.cmd @target\tmp\native-image-6423981942616512396.args org.graalvm.junit.platform.NativeImageJUnitLauncher returned non-zero result                                                                                                        
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:333)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:193)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:180)
    at java.util.concurrent.FutureTask.run (FutureTask.java:328)
    at java.util.concurrent.Executors$RunnableAdapter.call (Executors.java:545)
    at java.util.concurrent.FutureTask.run (FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:614)
    at java.lang.Thread.run (Thread.java:1474)
Caused by: org.apache.maven.plugin.MojoExecutionException: Execution of C:\Users\lingh\.version-fox\temp\1758124800-23880\java\bin\native-image.cmd @target\tmp\native-image-6423981942616512396.args org.graalvm.junit.platform.NativeImageJUnitLauncher returned non-zero result                                                              
    at org.graalvm.buildtools.maven.AbstractNativeImageMojo.buildImage (AbstractNativeImageMojo.java:476)
    at org.graalvm.buildtools.maven.NativeTestMojo.execute (NativeTestMojo.java:180)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:193)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:180)
    at java.util.concurrent.FutureTask.run (FutureTask.java:328)
    at java.util.concurrent.Executors$RunnableAdapter.call (Executors.java:545)
    at java.util.concurrent.FutureTask.run (FutureTask.java:328)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1090)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:614)
    at java.lang.Thread.run (Thread.java:1474)
[ERROR] 
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```