package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    public int g;

    public int h;

    public int i;

    public int j;

    public int k;

    public ParcelableVolumeInfo(Parcel paramParcel) {
        this.g = paramParcel.readInt();
        this.i = paramParcel.readInt();
        this.j = paramParcel.readInt();
        this.k = paramParcel.readInt();
        this.h = paramParcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.g);
        paramParcel.writeInt(this.i);
        paramParcel.writeInt(this.j);
        paramParcel.writeInt(this.k);
        paramParcel.writeInt(this.h);
    }

    public static final class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public ParcelableVolumeInfo createFromParcel(Parcel param1Parcel) {
            return new ParcelableVolumeInfo(param1Parcel);
        }

        public ParcelableVolumeInfo[] newArray(int param1Int) {
            return (ParcelableVolumeInfo[]) new ParcelableVolumeInfo[param1Int];
        }
    }
}
