# groovy-v500-graalvm-test

- For https://github.com/apache/shardingsphere/issues/29052 and I opened https://github.com/oracle/graal/issues/10200 .
- Verified unit test under Ubuntu 22.04.4 LTS with `SDKMAN!`.

```shell
sdk install java 22.0.2-graalce

git clone git@github.com:linghengqian/groovy-v500-graalvm-test.git
cd ./groovy-v500-graalvm-test/
sdk use java 22.0.2-graalce
./mvnw -PnativeTestCustom -e -T 1C clean test
```

- The log is as follows.

```shell
$ ./mvnw -PnativeTestCustom -e -T 1C clean test
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
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ groovy-v500-graalvm-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ groovy-v500-graalvm-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ groovy-v500-graalvm-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ groovy-v500-graalvm-test ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug target 22] to target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ groovy-v500-graalvm-test ---
[WARNING]  Parameter 'systemProperties' is deprecated: Use systemPropertyVariables instead.
[INFO] Surefire report directory: /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/target/surefire-reports
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running io.github.linghengqian.SimpleTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.050 s -- in io.github.linghengqian.SimpleTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- native:0.10.3:test (test-native) @ groovy-v500-graalvm-test ---
[INFO] ====================
[INFO] Initializing project: groovy-v500-graalvm-test
[INFO] ====================
[INFO] Found GraalVM installation from JAVA_HOME variable.
[INFO] Downloaded GraalVM reachability metadata repository from file:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.3/graalvm-reachability-metadata-0.10.3-repository.zip
[INFO] Executing: /home/linghengqian/.sdkman/candidates/java/22.0.2-graalce/bin/native-image -cp /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/target/test-classes:/home/linghengqian/.m2/repository/org/apache/groovy/groovy/5.0.0-alpha-11/groovy-5.0.0-alpha-11.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.11.2/junit-jupiter-5.11.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.11.2/junit-jupiter-api-5.11.2.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.11.2/junit-platform-commons-1.11.2.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.11.2/junit-jupiter-params-5.11.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.11.2/junit-jupiter-engine-5.11.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.11.2/junit-platform-engine-1.11.2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/native-maven-plugin/0.10.3/native-maven-plugin-0.10.3.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/utils/0.10.3/utils-0.10.3.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.3/graalvm-reachability-metadata-0.10.3.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/junit-platform-native/0.10.3/junit-platform-native-0.10.3.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-console/1.10.0/junit-platform-console-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-reporting/1.10.0/junit-platform-reporting-1.10.0.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-launcher/1.10.0/junit-platform-launcher-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.10.0/junit-platform-engine-1.10.0.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.10.0/junit-platform-commons-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.10.0/junit-jupiter-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.10.0/junit-jupiter-api-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.10.0/junit-jupiter-params-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.10.0/junit-jupiter-engine-5.10.0.jar --no-fallback -Ob -o /home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/target/native-tests -Djunit.platform.listeners.uid.tracking.output.dir=/home/linghengqian/TwinklingLiftWorks/git/public/groovy-v500-graalvm-test/target/test-ids --features=org.graalvm.junit.platform.JUnitPlatformFeature org.graalvm.junit.platform.NativeImageJUnitLauncher
========================================================================================================================
GraalVM Native Image: Generating 'native-tests' (executable)...
========================================================================================================================
[1/8] Initializing...
                                                                                    (0.0s @ 0.08GB)
Error: Could not find target method: protected static void com.oracle.svm.polyglot.groovy.Target_org_codehaus_groovy_vmplugin_v7_IndyInterface_invalidateSwitchPoints.invalidateSwitchPoints()
------------------------------------------------------------------------------------------------------------------------
                        0.2s (6.5% of total time) in 11 GCs | Peak RSS: 0.59GB | CPU load: 5.31
========================================================================================================================
Failed generating 'native-tests' after 1.8s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.917 s (Wall Clock)
[INFO] Finished at: 2024-11-30T14:43:43+08:00
[INFO] ------------------------------------------------------------------------
```