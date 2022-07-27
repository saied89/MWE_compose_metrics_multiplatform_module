# MWE_compose_metrics_multiplatform_module
Minimum working example for enabling compose compiler and compiler metrics in modules. It is working for the pure android `lib` module but not working for the
 multiplatform `shared`.

To assemble the projects with compose metrics
```
./gradlew clean assembleRelease -Pmyapp.enableComposeCompilerReports=true --rerun-tasks   
``` 
