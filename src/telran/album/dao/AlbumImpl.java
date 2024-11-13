package telran.album.dao;

import telran.album.model.Photo;

import java.time.LocalDate;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        photos[size++] = photo;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}
