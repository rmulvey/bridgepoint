---

This work is licensed under the Creative Commons CC0 License

---

# Parse errors in DeterministicBehaviorTestModel
### xtUML Project Implementation Note

### 1. Abstract

Running QA Manual Test #2147 failed for the 6.6 release. During the test, the model, DeterministicBehaviorTestModel, 
fails to launch in Verifier. Performing a subsequent parse all activities produces 10 errors in this model.  

### 2. Document References

<a id="2.1"></a>2.1 [BridgePoint DEI #9773](https://support.onefact.net/issues/9773) This issue  
<a id="2.2"></a>2.2 [BridgePoint DEI #2147](https://support.onefact.net/issues/2147) QA Manual test for Deterministic model execution.  

### 3. Background

The model/test/DeterministicBehaviorTestModel model shows parse errors.  
Here are the relevant errors in this model:  

|Description	|Resource	|Type	|Path	Location|  
|-------------|---------|-----|-------------|  
|Found interface operation with duplicate name ->Port1::startup<-	|Verifier_Start__Start_Verifier.oal_err	|Problem	/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Test_Driver/Test Driver/Verifier Start	|line 1|  
|Found interface operation with duplicate name ->Port4::report<-	|Verifier_Start__Start_Verifier.oal_err	|Problem	/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Test_Driver/Test Driver/Verifier Start	|line 7|  
|Found interface operation with duplicate name ->Port6::result<-	|A__initializing.oal_err	|Problem	/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Function_Monitor/Function Monitor/FM/A/ClassStateMachine	|line 6|  
|Found interface operation with duplicate name ->Port6::result<-	|A__running.oal_err	|Problem	/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Function_Monitor/Function Monitor/FM/A/ClassStateMachine	|line 3|
|Multiple ports found for ->Port1<-	|C__running.oal_err	|Problem	|/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Page_Creator/Page Creator/PC/C/InstanceStateMachine	|line 1|
|Multiple ports found for ->Port6<-	|B__alive.oal_err	|Problem	|/DeterministicBehaviorTestModel/models/DeterministicBehaviorTestModel/Function_Monitor/Function Monitor/FM/B/InstanceStateMachine	|line 4|

### 4. Requirements

4.1 Find the root cause for the parse errors in DeterministicBehaviorTestModel and fix the problem.   

### 5. Analysis
5.1 Isolate the problem  
5.1.1. Run parse all on this model against prior versions  
```
    6.4 modeler - (fail)
    6.4 Dev - (fail)
    6.2   (pass)
    6.0 - (pass)
    5.8.5 (pass)
    5.8   (pass) Note: this was the last time the Deterministic Execution test passed
```

5.1.2. I ran load and persist in 6.2, it did make some changes.  

5.1.2.1 I then opened the model in 6.4 and the "no smoking" was still there. I ran the 
2 operations to sync with lib and sync with refs, and the no-smoking did NOT go away.  

5.1.2.1.1 I then ran parse all and the errors called out in [3] are still present  

5.1.3. I ran the "check referential integrity" utility both before and after load and persist 
(which was done in 6.2). There were no referential integrity errors shown in either case.  

5.1.4. Potential Odd diffs after load and persist in 6.2  
This is simply an observation while looking through what "load and persist" actually changed.  

5.1.4.1 Shutdown_DB.xtuml - Note that at some point this was renamed from 
Shutdown_CFMon to Shutdown_DB. See here that "load and persist handled that. However, 
there is no port name "After" but that is OK because this is the interface file.  

5.1.4.1.1  
```
        -Before
            INSERT INTO GD_GE
        VALUES ("066836f5-4319-48cd-bb8c-fb6f98152594",
        "1ecb42fa-ecb0-4d99-8b20-54b4a57dffc7",
        "cad79b45-e0e4-465b-8f44-1c7dab9cb759",
        96,
        0,
        'DeterministicBehaviorTestModel::Shutdown_DB::Shutdown_CFMon');

        -After
            INSERT INTO GD_GE
        VALUES ("066836f5-4319-48cd-bb8c-fb6f98152594",
        "1ecb42fa-ecb0-4d99-8b20-54b4a57dffc7",
        "cad79b45-e0e4-465b-8f44-1c7dab9cb759",
        96,
        0,
        'DeterministicBehaviorTestModel::Shutdown_DB::Shutdown_DB');
```

5.1.4.2 It is observer that CL_POR instances were created (as expected)  

5.1.4.2 It is observed that some attributes were added to some instances (also expected)  

5.1.5. One Specific Example of a problem in this model is:  
```DeterministicBehaviorTestModel/Test_Driver/Test Driver/Verifier Start```  
    
5.1.5.1 The port messages are missing. In this case there should be 1, a required 
interface named "Startup". Note that this interface is defined in Startup::Startup  

5.1.5.2 Note that I can run BP6.2.0 and 6.4 at the same time against the same 
git model and 6.2 looks good while 6.4 has the problem. This is EVEN in the case 
AFTER I have performed the load and persist in 6.2.  Note that "looks good" means: 
"there is no ‘no smoking’ sign on the model anywhere (ports are syncronized), 
no parse errors, and the port operatations are displayed as they should be"  
  
*This implies this is a model load problem not related to model update*

5.1.6. Conclusion
Based on [5.1.5] above, specifically [5.1.5.2], the conclusion is a model load bug has been induced 
during in the 6.4 release.  
 
### 6. Implementation Comments

6.1 Model load bug investigation  

<TODO>  

### 7. Unit Test

7.1 Run the test that uncovered this problem, [2.2] and assure it passes.  


### 8. User Documentation

none  

### 9. Code Changes

<TODO>  

<pre>

 Put the file list here 

</pre>

### End

