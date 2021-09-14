package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    public final String g;

    public final CharSequence h;

    public final CharSequence i;

    public final CharSequence j;

    public final Bitmap k;

    public final Uri l;

    public final Bundle m;

    public final Uri n;

    public Object o;

    public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2) {
        this.g = paramString;
        this.h = paramCharSequence1;
        this.i = paramCharSequence2;
        this.j = paramCharSequence3;
        this.k = paramBitmap;
        this.l = paramUri1;
        this.m = paramBundle;
        this.n = paramUri2;
    }

    public static MediaDescriptionCompat a(Object paramObject) {
        MediaDescriptionCompat mediaDescriptionCompat;
        Uri uri1 = null;
        Uri uri2 = null;
        if (paramObject != null) {
            int i = Build.VERSION.SDK_INT;
            MediaDescription mediaDescription = (MediaDescription)paramObject;
            String str = mediaDescription.getMediaId();
            CharSequence charSequence1 = mediaDescription.getTitle();
            CharSequence charSequence2 = mediaDescription.getSubtitle();
            CharSequence charSequence3 = mediaDescription.getDescription();
            Bitmap bitmap = mediaDescription.getIconBitmap();
            Uri uri = mediaDescription.getIconUri();
            Bundle bundle = mediaDescription.getExtras();
            if (bundle != null) {
                MediaSessionCompat.a(bundle);
                uri1 = (Uri)bundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
            } else {
                uri1 = null;
            }
            if (uri1 != null)
                if (bundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle.size() == 2) {
                    bundle = null;
                } else {
                    bundle.remove("android.support.v4.media.description.MEDIA_URI");
                    bundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            if (uri1 == null) {
                uri1 = uri2;
                if (i >= 23)
                    uri1 = mediaDescription.getMediaUri();
            }
            mediaDescriptionCompat = new MediaDescriptionCompat(str, charSequence1, charSequence2, charSequence3, bitmap, uri, bundle, uri1);
            mediaDescriptionCompat.o = paramObject;
        }
        return mediaDescriptionCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt) {
        int i = Build.VERSION.SDK_INT;
        Object object2 = this.o;
        Object object1 = object2;
        if (object2 == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.g);
            builder.setTitle(this.h);
            builder.setSubtitle(this.i);
            builder.setDescription(this.j);
            builder.setIconBitmap(this.k);
            builder.setIconUri(this.l);
            object2 = this.m;
            object1 = object2;
            if (i < 23) {
                object1 = object2;
                if (this.n != null) {
                    object1 = object2;
                    if (object2 == null) {
                        object1 = new Bundle();
                        object1.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }
                    object1.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.n);
                }
            }
            builder.setExtras((Bundle)object1);
            if (i >= 23)
                builder.setMediaUri(this.n);
            object1 = builder.build();
            this.o = object1;
        }
        ((MediaDescription)object1).writeToParcel(paramParcel, paramInt);
    }

    public static final class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel param1Parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(param1Parcel));
        }

        public Object[] newArray(int param1Int) {
            return (Object[])new MediaDescriptionCompat[param1Int];
        }
    }
}
