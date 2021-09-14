package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    public final int g;

    public final float h;

    public RatingCompat(int paramInt, float paramFloat) {
        this.g = paramInt;
        this.h = paramFloat;
    }

    public int describeContents() {
        return this.g;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = j0.c.b.a.a.W("Rating:style=");
        stringBuilder.append(this.g);
        stringBuilder.append(" rating=");
        float f = this.h;
        if (f < 0.0F) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.g);
        paramParcel.writeFloat(this.h);
    }

    public static final class a implements Parcelable.Creator<RatingCompat> {
        public RatingCompat createFromParcel(Parcel param1Parcel) {
            return new RatingCompat(param1Parcel.readInt(), param1Parcel.readFloat());
        }

        public RatingCompat[] newArray(int param1Int) {
            return (RatingCompat[]) new RatingCompat[param1Int];
        }
    }
}
