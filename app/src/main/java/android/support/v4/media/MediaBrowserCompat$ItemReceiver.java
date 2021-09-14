package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import f0.a.a.b.b;

public class MediaBrowserCompat$ItemReceiver extends b {
    public void a(int paramInt, Bundle paramBundle) {
        MediaSessionCompat.a(paramBundle);
        if (paramInt == 0 && paramBundle != null && paramBundle.containsKey("media_item")) {
            Parcelable parcelable = paramBundle.getParcelable("media_item");
            if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
                parcelable = parcelable;
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
