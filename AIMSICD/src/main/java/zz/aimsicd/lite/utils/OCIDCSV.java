package zz.aimsicd.lite.utils;

import java.util.ArrayList;


public class OCIDCSV  extends ArrayList<OCIDCSV.OCIDCSVLine> {

    public OCIDCSV() {
        super();
    }

    public void add(String[] newLine) {
        add(new OCIDCSVLine(newLine));
    }

    public class OCIDCSVLine {
        private final String[] ocidCell;

        public OCIDCSVLine(String[] ocidCell) {
            this.ocidCell = ocidCell;
        }

        public double getGPSLat() {
            return TruncatedLocation.truncateDouble(this.ocidCell[0], 5);
        }

        public double getGPSLon() {
            return TruncatedLocation.truncateDouble(this.ocidCell[1], 5);
        }

        public int getMCC() {
            return Integer.parseInt(this.ocidCell[2]);
        }

        public int getMNC() {
            return Integer.parseInt(this.ocidCell[3]);
        }

        public int getLAC() {
            return Integer.parseInt(this.ocidCell[4]);
        }

        public int getCID() {
            return Integer.parseInt(this.ocidCell[5]);
        }

        // Average signal in [dBm]
        public int getAvgSig() {
            return Integer.parseInt(this.ocidCell[6]);
        }

        //Average range in [m]
        public int getAvgRange() {
            return Integer.parseInt(this.ocidCell[7]);
        }

        public int getSamples() {
            return Integer.parseInt(this.ocidCell[8]);
        }

        public int isGPSExact() {
            return Integer.parseInt(this.ocidCell[9]);
        }

        public String getRAT() {
            return String.valueOf(this.ocidCell[10]);
        }

        // todo: what else we got here? ...
    }
}
