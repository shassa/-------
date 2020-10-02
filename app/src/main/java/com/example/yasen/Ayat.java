package com.example.yasen;




public class Ayat  {

    private String[] ayat;

    private  String aya;
    private String ay;
    private int sound;
    private int[] sounds={ R.raw.l,R.raw.l1, R.raw.l2,
            R.raw.l3,R.raw.l4, R.raw.l5,R.raw.l6,R.raw.l7, R.raw.l8,
            R.raw.l9,R.raw.l10, R.raw.l11,
            R.raw.l12,R.raw.l13, R.raw.l14,
            R.raw.l15,R.raw.l16, R.raw.l17,
            R.raw.l18,R.raw.l19, R.raw.l20,
            R.raw.l21,R.raw.l22, R.raw.l23,
            R.raw.l24,R.raw.l25, R.raw.l26,
            R.raw.l27,R.raw.l28, R.raw.l29,
            R.raw.l30,R.raw.l31, R.raw.l32,
            R.raw.l33,R.raw.l34, R.raw.l35,
            R.raw.l36,R.raw.l37, R.raw.l38,
            R.raw.l39,R.raw.l40, R.raw.l41,
            R.raw.l42,R.raw.l43, R.raw.l44,
            R.raw.l45,R.raw.l46, R.raw.l47,
            R.raw.l48,R.raw.l49, R.raw.l50,
            R.raw.l51,R.raw.l52, R.raw.l53,
            R.raw.l54,R.raw.l55, R.raw.l56,
            R.raw.l57,R.raw.l58, R.raw.l59,
            R.raw.l60,R.raw.l61, R.raw.l62,
            R.raw.l63,R.raw.l64, R.raw.l65,
            R.raw.l66,R.raw.l67, R.raw.l68,
            R.raw.l69,R.raw.l70, R.raw.l71,
            R.raw.l72,R.raw.l73, R.raw.l74,
            R.raw.l75,R.raw.l76, R.raw.l77,
            R.raw.l78,R.raw.l80, R.raw.l81,
            R.raw.l82
    };

    public Ayat(MainActivity context) {
        ayat =context.getResources().getStringArray(R.array.ayat_array);
        ay =context.getString(R.string.sadak_alla_el3azem);

    }


    String getAya(int i){
        if(i>=ayat.length)
            aya=ay;
        else
               aya =ayat[i];
        return aya;
    }

    int getSound(int i){
        if(i>=sounds.length)
            sound=R.raw.l;
        else
            sound=sounds[i];
        return sound;

    }

}
