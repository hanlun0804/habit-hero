package habit.habithero.Database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import habit.habithero.Models.Converters;
import habit.habithero.Models.Habit;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Habit> __insertionAdapterOfHabit;

  private Converters __converters;

  private final EntityDeletionOrUpdateAdapter<Habit> __deletionAdapterOfHabit;

  private final EntityDeletionOrUpdateAdapter<Habit> __updateAdapterOfHabit;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabit = new EntityInsertionAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `habits_table` (`id`,`title`,`category`,`repeatOnDate`,`repeatOnDay`,`timesADay`,`isChecked`,`isToday`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        stmt.bindLong(4, value.getRepeatOnDate());
        final String _tmp = __converters().fromIntList(value.getRepeatOnDay());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getTimesADay() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTimesADay());
        }
        final int _tmp_1 = value.isChecked() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        final int _tmp_2 = value.isToday() ? 1 : 0;
        stmt.bindLong(8, _tmp_2);
      }
    };
    this.__deletionAdapterOfHabit = new EntityDeletionOrUpdateAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `habits_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfHabit = new EntityDeletionOrUpdateAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `habits_table` SET `id` = ?,`title` = ?,`category` = ?,`repeatOnDate` = ?,`repeatOnDay` = ?,`timesADay` = ?,`isChecked` = ?,`isToday` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        stmt.bindLong(4, value.getRepeatOnDate());
        final String _tmp = __converters().fromIntList(value.getRepeatOnDay());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getTimesADay() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTimesADay());
        }
        final int _tmp_1 = value.isChecked() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        final int _tmp_2 = value.isToday() ? 1 : 0;
        stmt.bindLong(8, _tmp_2);
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM habits_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Habit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHabit.insert(habit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Habit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHabit.handle(habit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Habit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfHabit.handle(habit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Habit>> getAll() {
    final String _sql = "SELECT * FROM habits_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"habits_table"}, false, new Callable<List<Habit>>() {
      @Override
      public List<Habit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfRepeatOnDate = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDate");
          final int _cursorIndexOfRepeatOnDay = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDay");
          final int _cursorIndexOfTimesADay = CursorUtil.getColumnIndexOrThrow(_cursor, "timesADay");
          final int _cursorIndexOfIsChecked = CursorUtil.getColumnIndexOrThrow(_cursor, "isChecked");
          final int _cursorIndexOfIsToday = CursorUtil.getColumnIndexOrThrow(_cursor, "isToday");
          final List<Habit> _result = new ArrayList<Habit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Habit _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final int _tmpRepeatOnDate;
            _tmpRepeatOnDate = _cursor.getInt(_cursorIndexOfRepeatOnDate);
            final List<Integer> _tmpRepeatOnDay;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfRepeatOnDay)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfRepeatOnDay);
            }
            _tmpRepeatOnDay = __converters().toIntList(_tmp);
            final Integer _tmpTimesADay;
            if (_cursor.isNull(_cursorIndexOfTimesADay)) {
              _tmpTimesADay = null;
            } else {
              _tmpTimesADay = _cursor.getInt(_cursorIndexOfTimesADay);
            }
            final boolean _tmpIsChecked;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsChecked);
            _tmpIsChecked = _tmp_1 != 0;
            final boolean _tmpIsToday;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsToday);
            _tmpIsToday = _tmp_2 != 0;
            _item = new Habit(_tmpId,_tmpTitle,_tmpCategory,_tmpRepeatOnDate,_tmpRepeatOnDay,_tmpTimesADay,_tmpIsChecked,_tmpIsToday);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Habit> getToday() {
    final String _sql = "SELECT * FROM habits_table WHERE isToday = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfRepeatOnDate = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDate");
      final int _cursorIndexOfRepeatOnDay = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDay");
      final int _cursorIndexOfTimesADay = CursorUtil.getColumnIndexOrThrow(_cursor, "timesADay");
      final int _cursorIndexOfIsChecked = CursorUtil.getColumnIndexOrThrow(_cursor, "isChecked");
      final int _cursorIndexOfIsToday = CursorUtil.getColumnIndexOrThrow(_cursor, "isToday");
      final List<Habit> _result = new ArrayList<Habit>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Habit _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final int _tmpRepeatOnDate;
        _tmpRepeatOnDate = _cursor.getInt(_cursorIndexOfRepeatOnDate);
        final List<Integer> _tmpRepeatOnDay;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfRepeatOnDay)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfRepeatOnDay);
        }
        _tmpRepeatOnDay = __converters().toIntList(_tmp);
        final Integer _tmpTimesADay;
        if (_cursor.isNull(_cursorIndexOfTimesADay)) {
          _tmpTimesADay = null;
        } else {
          _tmpTimesADay = _cursor.getInt(_cursorIndexOfTimesADay);
        }
        final boolean _tmpIsChecked;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsChecked);
        _tmpIsChecked = _tmp_1 != 0;
        final boolean _tmpIsToday;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsToday);
        _tmpIsToday = _tmp_2 != 0;
        _item = new Habit(_tmpId,_tmpTitle,_tmpCategory,_tmpRepeatOnDate,_tmpRepeatOnDay,_tmpTimesADay,_tmpIsChecked,_tmpIsToday);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Habit> getChecked() {
    final String _sql = "SELECT * FROM habits_table WHERE isChecked = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfRepeatOnDate = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDate");
      final int _cursorIndexOfRepeatOnDay = CursorUtil.getColumnIndexOrThrow(_cursor, "repeatOnDay");
      final int _cursorIndexOfTimesADay = CursorUtil.getColumnIndexOrThrow(_cursor, "timesADay");
      final int _cursorIndexOfIsChecked = CursorUtil.getColumnIndexOrThrow(_cursor, "isChecked");
      final int _cursorIndexOfIsToday = CursorUtil.getColumnIndexOrThrow(_cursor, "isToday");
      final List<Habit> _result = new ArrayList<Habit>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Habit _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final int _tmpRepeatOnDate;
        _tmpRepeatOnDate = _cursor.getInt(_cursorIndexOfRepeatOnDate);
        final List<Integer> _tmpRepeatOnDay;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfRepeatOnDay)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfRepeatOnDay);
        }
        _tmpRepeatOnDay = __converters().toIntList(_tmp);
        final Integer _tmpTimesADay;
        if (_cursor.isNull(_cursorIndexOfTimesADay)) {
          _tmpTimesADay = null;
        } else {
          _tmpTimesADay = _cursor.getInt(_cursorIndexOfTimesADay);
        }
        final boolean _tmpIsChecked;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsChecked);
        _tmpIsChecked = _tmp_1 != 0;
        final boolean _tmpIsToday;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsToday);
        _tmpIsToday = _tmp_2 != 0;
        _item = new Habit(_tmpId,_tmpTitle,_tmpCategory,_tmpRepeatOnDate,_tmpRepeatOnDay,_tmpTimesADay,_tmpIsChecked,_tmpIsToday);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(Converters.class);
  }

  private synchronized Converters __converters() {
    if (__converters == null) {
      __converters = __db.getTypeConverter(Converters.class);
    }
    return __converters;
  }
}
