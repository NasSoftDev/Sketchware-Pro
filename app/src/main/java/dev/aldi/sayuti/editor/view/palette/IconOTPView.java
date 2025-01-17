package dev.aldi.sayuti.editor.view.palette;

import android.content.Context;
import android.view.ViewGroup;

import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

import mod.agus.jcoderz.beans.ViewBeans;

public class IconOTPView extends IconBase {

    public IconOTPView(Context context) {
        super(context);
    }

    @Override
    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.event_google_signin);
        setWidgetName("OTPView");
    }

    @Override
    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = ViewBeans.VIEW_TYPE_WIDGET_OTPVIEW;
        viewBean.layout.orientation = VERTICAL;
        viewBean.layout.width = ViewGroup.LayoutParams.MATCH_PARENT;
        viewBean.layout.paddingLeft = 8;
        viewBean.layout.paddingTop = 8;
        viewBean.layout.paddingRight = 8;
        viewBean.layout.paddingBottom = 8;
        viewBean.convert = "affan.ahmad.otp.OTPView";
        return viewBean;
    }
}
