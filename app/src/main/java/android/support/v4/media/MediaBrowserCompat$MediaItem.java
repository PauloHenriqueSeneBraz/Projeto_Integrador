package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    public final int g;

    public final MediaDescriptionCompat h;

    public MediaBrowserCompat$MediaItem(Parcel paramParcel) {
        this.g = paramParcel.readInt();
        this.h = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaItem{");
        stringBuilder.append("mFlags=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mDescription=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        paramParcel.writeInt(this.g);
        this.h.writeToParcel(paramParcel, paramInt);
    }

    public static final class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel param1Parcel) {
            return new MediaBrowserCompat$MediaItem(param1Parcel);
        }

        public Object[] newArray(int param1Int) {
            return (Object[])new MediaBrowserCompat$MediaItem[param1Int];
        }
    }
}
