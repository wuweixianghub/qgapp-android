package com.app.video.videoapp.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.app.jzapp.videoapps.bean.DownLoadBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWN_LOAD_BEAN".
*/
public class DownLoadBeanDao extends AbstractDao<DownLoadBean, Long> {

    public static final String TABLENAME = "DOWN_LOAD_BEAN";

    /**
     * Properties of entity DownLoadBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property FilePath = new Property(3, String.class, "filePath", false, "FILE_PATH");
        public final static Property IamgeUrl = new Property(4, String.class, "iamgeUrl", false, "IAMGE_URL");
        public final static Property Status = new Property(5, int.class, "status", false, "STATUS");
    }


    public DownLoadBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DownLoadBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWN_LOAD_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"URL\" TEXT," + // 1: url
                "\"NAME\" TEXT," + // 2: name
                "\"FILE_PATH\" TEXT," + // 3: filePath
                "\"IAMGE_URL\" TEXT," + // 4: iamgeUrl
                "\"STATUS\" INTEGER NOT NULL );"); // 5: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWN_LOAD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownLoadBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(4, filePath);
        }
 
        String iamgeUrl = entity.getIamgeUrl();
        if (iamgeUrl != null) {
            stmt.bindString(5, iamgeUrl);
        }
        stmt.bindLong(6, entity.getStatus());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownLoadBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(4, filePath);
        }
 
        String iamgeUrl = entity.getIamgeUrl();
        if (iamgeUrl != null) {
            stmt.bindString(5, iamgeUrl);
        }
        stmt.bindLong(6, entity.getStatus());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DownLoadBean readEntity(Cursor cursor, int offset) {
        DownLoadBean entity = new DownLoadBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // filePath
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // iamgeUrl
            cursor.getInt(offset + 5) // status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownLoadBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFilePath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIamgeUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStatus(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DownLoadBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DownLoadBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownLoadBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
