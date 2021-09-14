package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import f0.a.a.b.b;
import java.util.ArrayList;

public class MediaBrowserCompat$SearchResultReceiver extends b {
    public void a(int paramInt, Bundle paramBundle) {
        MediaSessionCompat.a(paramBundle);
        if (paramInt == 0 && paramBundle != null && paramBundle.containsKey("search_results")) {
            Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
            if (arrayOfParcelable != null) {
                ArrayList<MediaBrowserCompat$MediaItem> arrayList = new ArrayList();
                int i = arrayOfParcelable.length;
                for (paramInt = 0; paramInt < i; paramInt++)
                    arrayList.add((MediaBrowserCompat$MediaItem)arrayOfParcelable[paramInt]);
            }
            throw null;
        }
        throw null;
    }
}
