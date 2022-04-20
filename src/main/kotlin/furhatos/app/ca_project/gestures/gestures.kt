package furhatos.app.ca_project.gestures

import furhatos.gestures.ARKitParams
import furhatos.gestures.defineGesture

val X2Y2 = defineGesture("X2Y2") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_BLINK_LEFT to 0.01
        ARKitParams.EYE_BLINK_RIGHT to 0.01
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.11
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.11
        ARKitParams.BROW_INNER_UP to 0.07
        ARKitParams.BROW_DOWN_LEFT to 0.24
        ARKitParams.BROW_DOWN_RIGHT to 0.24
        ARKitParams.MOUTH_SMILE_LEFT to 0.21
        ARKitParams.MOUTH_SMILE_RIGHT to 0.15
        ARKitParams.MOUTH_FUNNEL to 0.07
        ARKitParams.MOUTH_PUCKER to 0.06
        ARKitParams.MOUTH_STRETCH_LEFT to 0.1
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.09
        ARKitParams.MOUTH_PRESS_LEFT to 0.03
        ARKitParams.MOUTH_PRESS_RIGHT to 0.03
        ARKitParams.MOUTH_ROLL_LOWER to 0.07
        ARKitParams.MOUTH_SHRUG_UPPER to 0.05
        ARKitParams.MOUTH_SHRUG_LOWER to 0.08
        ARKitParams.MOUTH_UPPER_UP_LEFT to 0.06
        ARKitParams.MOUTH_UPPER_UP_RIGHT to 0.05
        ARKitParams.CHEEK_SQUINT_LEFT to 0.11
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.11
    }
}



val X2Y1 = defineGesture("X2Y1") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_SQUINT_LEFT to 0.11
        ARKitParams.EYE_SQUINT_RIGHT to 0.11
        ARKitParams.EYE_WIDE_LEFT to 0.0
        ARKitParams.EYE_WIDE_RIGHT to 0.0
        ARKitParams.BROW_INNER_UP to 0.07
        ARKitParams.BROW_DOWN_LEFT to 0.13
        ARKitParams.BROW_DOWN_RIGHT to 0.13
        ARKitParams.MOUTH_PUCKER to 0.07
        ARKitParams.MOUTH_FROWN_LEFT to 0.0
        ARKitParams.MOUTH_FROWN_RIGHT to 0.0
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.11
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.1
        ARKitParams.MOUTH_PRESS_LEFT to 0.02
        ARKitParams.MOUTH_PRESS_RIGHT to 0.02
        ARKitParams.MOUTH_ROLL_LOWER to 0.04
        ARKitParams.MOUTH_SHRUG_UPPER to 0.04
        ARKitParams.MOUTH_SHRUG_LOWER to 0.07
        
    }
}

val X2Y0 = defineGesture("X2Y0") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_BLINK_LEFT to 0.14
        ARKitParams.EYE_BLINK_RIGHT to 0.14
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.18
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.18
        ARKitParams.BROW_INNER_UP to 0.26
        ARKitParams.BROW_OUTER_UP_LEFT to 0.18
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.18
        ARKitParams.BROW_DOWN_LEFT to 0.0
        ARKitParams.BROW_DOWN_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 0.59
        ARKitParams.MOUTH_SMILE_RIGHT to 0.58
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.17
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.15
        ARKitParams.MOUTH_ROLL_LOWER to 0.11
        ARKitParams.CHEEK_SQUINT_LEFT to 0.29
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.3
    }
}

val X1Y2 = defineGesture("X1Y2") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_BLINK_LEFT to 0.0
        ARKitParams.EYE_BLINK_RIGHT to 0.0
        ARKitParams.EYE_LOOK_DOWN_LEFT  to 0.02
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.02
        ARKitParams.EYE_WIDE_LEFT to 0.37
        ARKitParams.EYE_WIDE_RIGHT to 0.37
        ARKitParams.BROW_INNER_UP to 0.76
        ARKitParams.BROW_OUTER_UP_LEFT to 0.64
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.64
        ARKitParams.BROW_DOWN_LEFT to 0.0
        ARKitParams.BROW_DOWN_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
        ARKitParams.MOUTH_DIMPLE_LEFT to 0.03
        ARKitParams.MOUTH_DIMPLE_RIGHT to 0.03
        ARKitParams.MOUTH_FROWN_LEFT to 0.09
        ARKitParams.MOUTH_FROWN_RIGHT to 0.09
        ARKitParams.MOUTH_STRETCH_LEFT to 0.18
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.17
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.14
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.13
        ARKitParams.MOUTH_SHRUG_LOWER to 0.15
    }
}

val X0Y2 = defineGesture("X0Y2") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_SQUINT_LEFT to 0.23
        ARKitParams.EYE_SQUINT_RIGHT to 0.23
        ARKitParams.EYE_WIDE_LEFT to 0.12
        ARKitParams.EYE_WIDE_RIGHT to 0.12
        ARKitParams.BROW_INNER_UP to 0.55
        ARKitParams.BROW_OUTER_UP_LEFT to 0.29
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.29
        ARKitParams.JAW_FORWARD to 0.19
        ARKitParams.MOUTH_CLOSE to 0.04
        ARKitParams.MOUTH_PUCKER to 0.14
        ARKitParams.MOUTH_FROWN_LEFT to 0.74
        ARKitParams.MOUTH_FROWN_RIGHT to 0.74
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.04
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.04
        ARKitParams.MOUTH_PRESS_LEFT to 0.09
        ARKitParams.MOUTH_PRESS_RIGHT to 0.09
        ARKitParams.MOUTH_ROLL_LOWER to 0.19
        ARKitParams.MOUTH_SHRUG_UPPER to 0.54
        ARKitParams.MOUTH_SHRUG_LOWER to 0.6
        ARKitParams.CHEEK_SQUINT_LEFT to 0.18
    }
}

val X1Y1 = defineGesture("X1Y1") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_BLINK_LEFT to 0.0
        ARKitParams.EYE_BLINK_RIGHT to 0.0
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.1
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.1
        ARKitParams.EYE_WIDE_LEFT to 0.25
        ARKitParams.EYE_WIDE_RIGHT to 0.25
        ARKitParams.BROW_INNER_UP to 0.71
        ARKitParams.BROW_OUTER_UP_LEFT to 0.44
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.44
        ARKitParams.MOUTH_SMILE_LEFT to 0.12
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
        ARKitParams.MOUTH_LEFT to 0.13
        ARKitParams.MOUTH_STRETCH_LEFT to 0.16
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.13
        ARKitParams.CHEEK_SQUINT_LEFT to 0.12
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.1
    }
}

val X1Y0 = defineGesture("X1Y0") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.0
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.0
        ARKitParams.EYE_LOOK_UP_LEFT to 0.22
        ARKitParams.EYE_LOOK_UP_RIGHT to 0.22
        ARKitParams.EYE_SQUINT_LEFT to 0.44
        ARKitParams.EYE_SQUINT_RIGHT to 0.44
        ARKitParams.EYE_WIDE_LEFT to 0.36
        ARKitParams.EYE_WIDE_RIGHT to 0.36
        ARKitParams.BROW_INNER_UP to 0.23
        ARKitParams.BROW_OUTER_UP_LEFT to 0.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.0
        ARKitParams.BROW_DOWN_LEFT to 0.54
        ARKitParams.BROW_DOWN_RIGHT to 0.54
        ARKitParams.MOUTH_SMILE_LEFT to 0.08
        ARKitParams.MOUTH_SMILE_RIGHT to 0.09
        ARKitParams.JAW_OPEN to 0.09
        ARKitParams.MOUTH_FUNNEL to 0.23
        ARKitParams.MOUTH_LEFT to 0.02
        ARKitParams.MOUTH_LOWER_DOWN_LEFT to 0.32
        ARKitParams.MOUTH_LOWER_DOWN_RIGHT to 0.3
        ARKitParams.MOUTH_ROLL_LOWER to 0.05
        ARKitParams.CHEEK_SQUINT_LEFT to 0.17
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.19
    }
}

val X0Y1 = defineGesture("X0Y1") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_SQUINT_LEFT to 0.42
        ARKitParams.EYE_SQUINT_RIGHT to 0.42
        ARKitParams.BROW_INNER_UP to 0.09
        ARKitParams.BROW_OUTER_UP_LEFT to 0.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.0
        ARKitParams.BROW_DOWN_LEFT to 0.77
        ARKitParams.BROW_DOWN_RIGHT to 0.77
        ARKitParams.JAW_FORWARD to 0.04
        ARKitParams.JAW_OPEN to 0.03
        ARKitParams.MOUTH_FROWN_LEFT to 0.1
        ARKitParams.MOUTH_FROWN_RIGHT to 0.11
        ARKitParams.MOUTH_STRETCH_LEFT to 0.08
        ARKitParams.MOUTH_STRETCH_RIGHT to 0.08
        ARKitParams.MOUTH_ROLL_LOWER to 0.11
        ARKitParams.MOUTH_SHRUG_UPPER to 0.18
        ARKitParams.MOUTH_SHRUG_LOWER to 0.25
    }
}

val X0Y0 = defineGesture("X0Y0") {
    frame(0.32, 0.72, persist = true) {
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.07
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.07
        ARKitParams.EYE_SQUINT_LEFT to 0.16
        ARKitParams.EYE_SQUINT_RIGHT to 0.16
        ARKitParams.BROW_INNER_UP to 0.14
        ARKitParams.MOUTH_FROWN_LEFT to 0.06
        ARKitParams.MOUTH_FROWN_RIGHT to 0.06
        ARKitParams.MOUTH_SHRUG_UPPER to 0.31
        ARKitParams.MOUTH_SHRUG_LOWER to 0.4
        ARKitParams.CHEEK_SQUINT_LEFT to 0.09
        ARKitParams.CHEEK_SQUINT_RIGHT to 0.11
    }
}