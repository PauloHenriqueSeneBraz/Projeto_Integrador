package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public class MediaSessionCompat {
    public static void a(Bundle paramBundle) {
        if (paramBundle != null)
            paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        public final MediaDescriptionCompat g;

        public final long h;

        public QueueItem(Parcel param1Parcel) {
            this.g = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(param1Parcel);
            this.h = param1Parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = j0.c.b.a.a.W("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.g);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.h);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel param1Parcel, int param1Int) {
            this.g.writeToParcel(param1Parcel, param1Int);
            param1Parcel.writeLong(this.h);
        }

        public static final class a implements Parcelable.Creator<QueueItem> {
            public QueueItem createFromParcel(Parcel param2Parcel) {
                return new MediaSessionCompat.QueueItem(param2Parcel);
            }

            public QueueItem[] newArray(int param2Int) {
                return (QueueItem[]) new QueueItem[param2Int];
            }
        }
    }

    public static final class a implements Parcelable.Creator<QueueItem> {
        public QueueItem createFromParcel(Parcel param1Parcel) {
            return new MediaSessionCompat.QueueItem(param1Parcel);
        }

        public QueueItem[] newArray(int param1Int) {
            return (QueueItem[]) new QueueItem[param1Int];
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        public ResultReceiver g;

        public ResultReceiverWrapper(Parcel param1Parcel) {
            this.g = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(param1Parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel param1Parcel, int param1Int) {
            this.g.writeToParcel(param1Parcel, param1Int);
        }

        public static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public ResultReceiverWrapper createFromParcel(Parcel param2Parcel) {
                return new MediaSessionCompat.ResultReceiverWrapper(param2Parcel);
            }

            public ResultReceiverWrapper[] newArray(int param2Int) {
                return (ResultReceiverWrapper[]) new ResultReceiverWrapper[param2Int];
            }
        }
    }

    public static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
        public ResultReceiverWrapper createFromParcel(Parcel param1Parcel) {
            return new MediaSessionCompat.ResultReceiverWrapper(param1Parcel);
        }

        public ResultReceiverWrapper[] newArray(int param1Int) {
            return (ResultReceiverWrapper[]) new ResultReceiverWrapper[param1Int];
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        public final Object g;

        public f0.a.a.a.a.a h;

        public Token(Object param1Object) {
            this.g = param1Object;
            this.h = null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object param1Object) {
            if (this == param1Object)
                return true;
            if (!(param1Object instanceof Token))
                return false;
            Token token = (Token)param1Object;
            param1Object = this.g;
            if (param1Object == null)
                return (token.g == null);
            Object object = token.g;
            return (object == null) ? false : param1Object.equals(object);
        }

        public int hashCode() {
            Object object = this.g;
            return (object == null) ? 0 : object.hashCode();
        }

        public void writeToParcel(Parcel param1Parcel, int param1Int) {
            param1Parcel.writeParcelable((Parcelable)this.g, param1Int);
        }

        public static final class a implements Parcelable.Creator<Token> {
            public Token createFromParcel(Parcel param2Parcel) {
                return new MediaSessionCompat.Token(param2Parcel.readParcelable(null));
            }

            public Token[] newArray(int param2Int) {
                return (Token[]) new Token[param2Int];
            }
        }
    }

    public static final class a implements Parcelable.Creator<Token> {
        public Token createFromParcel(Parcel param1Parcel) {
            return new MediaSessionCompat.Token(param1Parcel.readParcelable(null));
        }

        public Token[] newArray(int param1Int) {
            return (Token[]) new Token[param1Int];
        }
    }
}
