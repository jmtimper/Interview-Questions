package main;

public class MajorScales {

    String[] chromatic = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    String[] solfegeScale = {"Do", "Re", "Mi", "Fa", "So", "La", "Ti"};
    int[] semitones = {0, 2, 4, 5, 7, 9, 11};

    public String note(String chrom, String scale){
        int pos;
        for(pos = 0; pos < chromatic.length; pos++){
            if(chromatic[pos].equals(chrom)) break;
        }
        int scalePos;
        for(scalePos = 0; scalePos < solfegeScale.length; scalePos++ ){
            if(solfegeScale[scalePos].equals(scale)) break;
        }
        pos += semitones[scalePos];
        if(pos > chromatic.length) pos -= chromatic.length;
        return chromatic[pos];
    }

}
