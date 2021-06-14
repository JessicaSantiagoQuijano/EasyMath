package mx.edu.unpa.JSQ_SQO;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class CustomAnimation {
    private static CustomAnimation mThis = new CustomAnimation();
    public enum AnimationType {
        FadeIn, ZoomIn, ZoomOut, Blink
    }
    Animation animation = null;

    private CustomAnimation()
    {

    }

    public void startAnimation(Context context, AnimationType animationType, View view)
    {
        // Animation animation = null;
        switch (animationType)
        {
            case ZoomIn:
            {
                animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in);
            }
            break;
            case ZoomOut:
            {
                animation = AnimationUtils.loadAnimation(context, R.anim.zoom_out);
            }
            break;
        }

        view.startAnimation(animation);
    }

    public void endAnimation(Context origin, Class destiny, View view){
        int x = 0;
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Intent _intent = new Intent(origin, destiny);
                // origin.startActivity(_intent);
                animation = AnimationUtils.loadAnimation(origin, R.anim.zoom_out);
                view.startAnimation(animation);
                Intent _intent = new Intent(origin, destiny);
                _intent.putExtra("idButton", view.getId());
                origin.startActivity(_intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public static CustomAnimation getThis()
    {
        return mThis;
    }
}
