package com.example.sargis.homework1;

import android.content.Context;

import java.util.ArrayList;

public class BmwProvider {
    public static ArrayList<BmwModel> getBmwProviderContent(Context context) {
        ArrayList<BmwModel> bmwList = new ArrayList<>();
        final BmwModel bmwModel1 = new BmwModel();
        bmwModel1.setTitle(context.getString(R.string.series_1));
        bmwModel1.setContent(context.getString(R.string.series_1_content));
        bmwModel1.setImageUrl(context.getString(R.string.series_1_url));
        bmwModel1.setModification(context.getString(R.string.sedan_1));
        bmwModel1.setContentUrl(context.getString(R.string.contentUrl_1));

        BmwModel bmwModel2 = new BmwModel();
        bmwModel2.setTitle(context.getString(R.string.series_2));
        bmwModel2.setContent(context.getString(R.string.series_2_content));
        bmwModel2.setImageUrl(context.getString(R.string.series_2_url));
        bmwModel2.setModification(context.getString(R.string.coupe));
        bmwModel2.setContentUrl(context.getString(R.string.contentUrl_2));

        BmwModel bmwModel3 = new BmwModel();
        bmwModel3.setTitle(context.getString(R.string.series_3));
        bmwModel3.setContent(context.getString(R.string.series_3_content));
        bmwModel3.setImageUrl(context.getString(R.string.series_3_url));
        bmwModel3.setModification(context.getString(R.string.coupe));
        bmwModel3.setContentUrl(context.getString(R.string.contentUrl_3));

        BmwModel bmwModel4 = new BmwModel();
        bmwModel4.setTitle(context.getString(R.string.series_4));
        bmwModel4.setContent(context.getString(R.string.series_4_content));
        bmwModel4.setImageUrl(context.getString(R.string.series_4_url));
        bmwModel4.setModification(context.getString(R.string.gran_coupe));
        bmwModel4.setContentUrl(context.getString(R.string.contentUrl_4));

        BmwModel bmwModel5 = new BmwModel();
        bmwModel5.setTitle(context.getString(R.string.series_5));
        bmwModel5.setContent(context.getString(R.string.series_5_content));
        bmwModel5.setImageUrl(context.getString(R.string.series_5_url));
        bmwModel5.setModification(context.getString(R.string.sedan_1));
        bmwModel5.setContentUrl(context.getString(R.string.contentUrl_5));

        BmwModel bmwModel6 = new BmwModel();
        bmwModel6.setTitle(context.getString(R.string.series_6));
        bmwModel6.setContent(context.getString(R.string.series_6_content));
        bmwModel6.setImageUrl(context.getString(R.string.series_6_url));
        bmwModel6.setModification(context.getString(R.string.coupe));
        bmwModel6.setContentUrl(context.getString(R.string.contentUrl_6));

        BmwModel bmwModel7 = new BmwModel();
        bmwModel7.setTitle(context.getString(R.string.series_7));
        bmwModel7.setContent(context.getString(R.string.series_7_content));
        bmwModel7.setImageUrl(context.getString(R.string.series_7_url));
        bmwModel7.setModification(context.getString(R.string.sedan_1));
        bmwModel7.setContentUrl(context.getString(R.string.contentUrl_7));

        BmwModel bmwModel8 = new BmwModel();
        bmwModel8.setTitle(context.getString(R.string.series_8));
        bmwModel8.setContent(context.getString(R.string.series_8_content));
        bmwModel8.setImageUrl(context.getString(R.string.series_8_url));
        bmwModel8.setModification(context.getString(R.string.coupe));
        bmwModel8.setContentUrl(context.getString(R.string.contentUrl_8));

        BmwModel bmwModel9 = new BmwModel();
        bmwModel9.setTitle(context.getString(R.string.series_x));
        bmwModel9.setContent(context.getString(R.string.series_x_content));
        bmwModel9.setImageUrl(context.getString(R.string.series_x_url));
        bmwModel9.setModification(context.getString(R.string.off_road));
        bmwModel9.setContentUrl(context.getString(R.string.contentUrl_9));

        BmwModel bmwModel10 = new BmwModel();
        bmwModel10.setTitle(context.getString(R.string.series_m));
        bmwModel10.setContent(context.getString(R.string.series_m_content));
        bmwModel10.setImageUrl(context.getString(R.string.series_m_url));
        bmwModel10.setModification(context.getString(R.string.sedan_1));
        bmwModel10.setContentUrl(context.getString(R.string.contentUrl_10));

        BmwModel bmwModel11 = new BmwModel();
        bmwModel11.setTitle(context.getString(R.string.series_i));
        bmwModel11.setContent(context.getString(R.string.series_i_content));
        bmwModel11.setImageUrl(context.getString(R.string.series_i_url));
        bmwModel11.setModification(context.getString(R.string.coupe));
        bmwModel11.setContentUrl(context.getString(R.string.contentUrl_11));

        bmwList.add(bmwModel1);
        bmwList.add(bmwModel2);
        bmwList.add(bmwModel3);
        bmwList.add(bmwModel4);
        bmwList.add(bmwModel5);
        bmwList.add(bmwModel6);
        bmwList.add(bmwModel7);
        bmwList.add(bmwModel8);
        bmwList.add(bmwModel9);
        bmwList.add(bmwModel10);
        bmwList.add(bmwModel11);

        return bmwList;
    }
}
