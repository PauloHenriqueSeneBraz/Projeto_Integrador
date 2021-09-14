package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    public final int g;

    public final long h;

    public final long i;

    public final float j;

    public final long k;

    public final int l;

    public final CharSequence m;

    public final long n;

    public List<CustomAction> o;

    public final long p;

    public final Bundle q;

    public PlaybackStateCompat(Parcel paramParcel) {
        this.g = paramParcel.readInt();
        this.h = paramParcel.readLong();
        this.j = paramParcel.readFloat();
        this.n = paramParcel.readLong();
        this.i = paramParcel.readLong();
        this.k = paramParcel.readLong();
        this.m = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
        this.o = paramParcel.createTypedArrayList(CustomAction.CREATOR);
        this.p = paramParcel.readLong();
        this.q = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.l = paramParcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", position=");
        stringBuilder.append(this.h);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.i);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.j);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.n);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.k);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.l);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.m);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.o);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.p);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.g);
        paramParcel.writeLong(this.h);
        paramParcel.writeFloat(this.j);
        paramParcel.writeLong(this.n);
        paramParcel.writeLong(this.i);
        paramParcel.writeLong(this.k);
        TextUtils.writeToParcel(this.m, paramParcel, paramInt);
        paramParcel.writeTypedList(this.o);
        paramParcel.writeLong(this.p);
        paramParcel.writeBundle(this.q);
        paramParcel.writeInt(this.l);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        public final String g;

        public final CharSequence h;

        public final int i;

        public final Bundle j;

        public CustomAction(Parcel param1Parcel) {
            this.g = param1Parcel.readString();
            this.h = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
            this.i = param1Parcel.readInt();
            this.j = param1Parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = j0.c.b.a.a.W("Action:mName='");
            stringBuilder.append(this.h);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.i);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.j);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel param1Parcel, int param1Int) {
            param1Parcel.writeString(this.g);
            TextUtils.writeToParcel(this.h, param1Parcel, param1Int);
            param1Parcel.writeInt(this.i);
            param1Parcel.writeBundle(this.j);
        }

        public static final class a implements Parcelable.Creator<CustomAction> {
            public CustomAction createFromParcel(Parcel param2Parcel) {
                return new PlaybackStateCompat.CustomAction(param2Parcel);
            }

            public CustomAction[] newArray(int param2Int) {
                return (CustomAction[]) new CustomAction[param2Int];
            }
        }
    }

    public static final class a implements Parcelable.Creator<CustomAction> {
        public CustomAction createFromParcel(Parcel param1Parcel) {
            return new PlaybackStateCompat.CustomAction(param1Parcel);
        }

        public CustomAction[] newArray(int param1Int) {
            return (CustomAction[]) new CustomAction[param1Int];
        }
    }

    public static final class a implements Parcelable.Creator<PlaybackStateCompat> {
        public PlaybackStateCompat createFromParcel(Parcel param1Parcel) {
            return new PlaybackStateCompat(param1Parcel);
        }

        public PlaybackStateCompat[] newArray(int param1Int) {
            return (PlaybackStateCompat[]) new PlaybackStateCompat[param1Int];
        }
    }
}
