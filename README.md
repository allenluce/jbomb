# Bombing problem!

This is the code accompanying a [question on Stack Overflow](https://stackoverflow.com/questions/58458359).

## Building

    ./gradlew build

## Running on an emulator

This code was tested on the Android Studio 3.5.1 emulator running a
Pixel XL AVD with Android 6.0 (API 23). It can be installed after build with:

    adb install app/build/outputs/apk/debug/app-debug.apk
    
## The Crash

A full run and crash log:

```
10-18 14:11:42.934  1945  2196 I ActivityManager: START u0 {act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10000000 cmp=com.horph.jbomb/.MainActivity} from uid 0 on display 0
10-18 14:11:42.954  4624  4624 D AndroidRuntime: Shutting down VM
10-18 14:11:43.000  4633  4633 I art     : Not late-enabling -Xcheck:jni (already on)
10-18 14:11:43.005  1945  2100 I ActivityManager: Start proc 4633:com.horph.jbomb/u0a62 for activity com.horph.jbomb/.MainActivity
10-18 14:11:43.008  1302  2197 D gralloc_ranchu: gralloc_alloc: Creating ashmem region of size 13778944
10-18 14:11:43.033  4633  4633 W System  : ClassLoader referenced unknown path: /data/app/com.horph.jbomb-1/lib/x86
10-18 14:11:43.062  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$CbeKW6_ggTAEDuiYP5MNn0HcZP8>
10-18 14:11:43.063  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$CbeKW6_ggTAEDuiYP5MNn0HcZP8>
10-18 14:11:43.064  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$ufk8EzSGNrFERmOv4FRLnKdYQmk>
10-18 14:11:43.064  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$ufk8EzSGNrFERmOv4FRLnKdYQmk>
10-18 14:11:43.064  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$8ZgcGIBRreAdL3SZRoBdia8tBNE>
10-18 14:11:43.064  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$8ZgcGIBRreAdL3SZRoBdia8tBNE>
10-18 14:11:43.065  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$rVbXF7CJsMPOrs-U6cyeUbzclB4>
10-18 14:11:43.065  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$rVbXF7CJsMPOrs-U6cyeUbzclB4>
10-18 14:11:43.065  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$4FnWdluDqx5PZJf9fFoUfsQy6ow>
10-18 14:11:43.065  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannel$4FnWdluDqx5PZJf9fFoUfsQy6ow>
10-18 14:11:43.072  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$MiWdpUuVApW-kUUdvtuDGskGLYU>
10-18 14:11:43.074  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$MiWdpUuVApW-kUUdvtuDGskGLYU>
10-18 14:11:43.079  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$x6KVt34FEgGgeCvbArLaphjNhpo>
10-18 14:11:43.079  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$x6KVt34FEgGgeCvbArLaphjNhpo>
10-18 14:11:43.080  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$eqqqKhMcVuno-rHMEVn_3BlC9l8>
10-18 14:11:43.080  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$eqqqKhMcVuno-rHMEVn_3BlC9l8>
10-18 14:11:43.080  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$uxPs9K2HgO14b8aJrFbcRH_9Z7E>
10-18 14:11:43.080  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$uxPs9K2HgO14b8aJrFbcRH_9Z7E>
10-18 14:11:43.082  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$c_nvwZVkY4mjuNXb-kmw12XcBBQ>
10-18 14:11:43.082  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.util.-$$Lambda$Util$c_nvwZVkY4mjuNXb-kmw12XcBBQ>
10-18 14:11:43.105  3306  3362 D EGL_emulation: eglMakeCurrent: 0xaa9aa500: ver 3 0 (tinfo 0xaa991d70)
10-18 14:11:43.107  2222  2698 D EGL_emulation: eglMakeCurrent: 0xae614f00: ver 3 0 (tinfo 0xae612600)
10-18 14:11:43.107  3306  3362 E Surface : getSlotFromBufferLocked: unknown buffer: 0xb407c940
10-18 14:11:43.134  2222  2698 D EGL_emulation: eglMakeCurrent: 0xae614f00: ver 3 0 (tinfo 0xae612600)
10-18 14:11:43.145  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.jmx.ResourceDMBean>
10-18 14:11:43.145  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.jmx.ResourceDMBean>
10-18 14:11:43.146  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannelProbeHandler$PgjTCPUvxiDAHJ5bXDHSRlq3W6o>
10-18 14:11:43.146  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$JChannelProbeHandler$PgjTCPUvxiDAHJ5bXDHSRlq3W6o>
10-18 14:11:43.147  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$lUlhAhi06dCsE53X8msckKVi5Yg>
10-18 14:11:43.147  2222  2698 D EGL_emulation: eglMakeCurrent: 0xae614f00: ver 3 0 (tinfo 0xae612600)
10-18 14:11:43.147  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$lUlhAhi06dCsE53X8msckKVi5Yg>
10-18 14:11:43.148  4633  4633 I art     : Rejecting re-init on previously-failed class java.lang.Class<org.jgroups.-$$Lambda$CbeKW6_ggTAEDuiYP5MNn0HcZP8>
10-18 14:11:43.148  4633  4633 D AndroidRuntime: Shutting down VM
10-18 14:11:43.148  4633  4633 E AndroidRuntime: FATAL EXCEPTION: main
10-18 14:11:43.148  4633  4633 E AndroidRuntime: Process: com.horph.jbomb, PID: 4633
10-18 14:11:43.148  4633  4633 E AndroidRuntime: java.lang.NoClassDefFoundError: org.jgroups.-$$Lambda$CbeKW6_ggTAEDuiYP5MNn0HcZP8
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at org.jgroups.JChannel.init(JChannel.java:950)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at org.jgroups.JChannel.<init>(JChannel.java:125)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at org.jgroups.JChannel.<init>(JChannel.java:107)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at org.jgroups.JChannel.<init>(JChannel.java:98)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at com.horph.jbomb.MainActivity.onCreate(MainActivity.kt:10)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.Activity.performCreate(Activity.java:6237)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1107)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2369)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.ActivityThread.-wrap11(ActivityThread.java)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.os.Handler.dispatchMessage(Handler.java:102)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.os.Looper.loop(Looper.java:148)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at android.app.ActivityThread.main(ActivityThread.java:5417)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at java.lang.reflect.Method.invoke(Native Method)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
10-18 14:11:43.148  4633  4633 E AndroidRuntime: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
10-18 14:11:43.149  1945  2193 W ActivityManager:   Force finishing activity com.horph.jbomb/.MainActivity
```

