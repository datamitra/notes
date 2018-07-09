// ORM class for table 'orders'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 05 03:55:54 UTC 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class orders extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("orderNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.orderNumber = (Integer)value;
      }
    });
    setters.put("orderDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.orderDate = (java.sql.Date)value;
      }
    });
    setters.put("requiredDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.requiredDate = (java.sql.Date)value;
      }
    });
    setters.put("shippedDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.shippedDate = (java.sql.Date)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.status = (String)value;
      }
    });
    setters.put("comments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.comments = (String)value;
      }
    });
    setters.put("customerNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.customerNumber = (Integer)value;
      }
    });
  }
  public orders() {
    init0();
  }
  private Integer orderNumber;
  public Integer get_orderNumber() {
    return orderNumber;
  }
  public void set_orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }
  public orders with_orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }
  private java.sql.Date orderDate;
  public java.sql.Date get_orderDate() {
    return orderDate;
  }
  public void set_orderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }
  public orders with_orderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }
  private java.sql.Date requiredDate;
  public java.sql.Date get_requiredDate() {
    return requiredDate;
  }
  public void set_requiredDate(java.sql.Date requiredDate) {
    this.requiredDate = requiredDate;
  }
  public orders with_requiredDate(java.sql.Date requiredDate) {
    this.requiredDate = requiredDate;
    return this;
  }
  private java.sql.Date shippedDate;
  public java.sql.Date get_shippedDate() {
    return shippedDate;
  }
  public void set_shippedDate(java.sql.Date shippedDate) {
    this.shippedDate = shippedDate;
  }
  public orders with_shippedDate(java.sql.Date shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public orders with_status(String status) {
    this.status = status;
    return this;
  }
  private String comments;
  public String get_comments() {
    return comments;
  }
  public void set_comments(String comments) {
    this.comments = comments;
  }
  public orders with_comments(String comments) {
    this.comments = comments;
    return this;
  }
  private Integer customerNumber;
  public Integer get_customerNumber() {
    return customerNumber;
  }
  public void set_customerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
  }
  public orders with_customerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.orderNumber == null ? that.orderNumber == null : this.orderNumber.equals(that.orderNumber));
    equal = equal && (this.orderDate == null ? that.orderDate == null : this.orderDate.equals(that.orderDate));
    equal = equal && (this.requiredDate == null ? that.requiredDate == null : this.requiredDate.equals(that.requiredDate));
    equal = equal && (this.shippedDate == null ? that.shippedDate == null : this.shippedDate.equals(that.shippedDate));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
    equal = equal && (this.customerNumber == null ? that.customerNumber == null : this.customerNumber.equals(that.customerNumber));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.orderNumber == null ? that.orderNumber == null : this.orderNumber.equals(that.orderNumber));
    equal = equal && (this.orderDate == null ? that.orderDate == null : this.orderDate.equals(that.orderDate));
    equal = equal && (this.requiredDate == null ? that.requiredDate == null : this.requiredDate.equals(that.requiredDate));
    equal = equal && (this.shippedDate == null ? that.shippedDate == null : this.shippedDate.equals(that.shippedDate));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
    equal = equal && (this.customerNumber == null ? that.customerNumber == null : this.customerNumber.equals(that.customerNumber));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.orderNumber = JdbcWritableBridge.readInteger(1, __dbResults);
    this.orderDate = JdbcWritableBridge.readDate(2, __dbResults);
    this.requiredDate = JdbcWritableBridge.readDate(3, __dbResults);
    this.shippedDate = JdbcWritableBridge.readDate(4, __dbResults);
    this.status = JdbcWritableBridge.readString(5, __dbResults);
    this.comments = JdbcWritableBridge.readString(6, __dbResults);
    this.customerNumber = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.orderNumber = JdbcWritableBridge.readInteger(1, __dbResults);
    this.orderDate = JdbcWritableBridge.readDate(2, __dbResults);
    this.requiredDate = JdbcWritableBridge.readDate(3, __dbResults);
    this.shippedDate = JdbcWritableBridge.readDate(4, __dbResults);
    this.status = JdbcWritableBridge.readString(5, __dbResults);
    this.comments = JdbcWritableBridge.readString(6, __dbResults);
    this.customerNumber = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(orderNumber, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(orderDate, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(requiredDate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(shippedDate, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(status, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comments, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(customerNumber, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(orderNumber, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(orderDate, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(requiredDate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(shippedDate, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(status, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(comments, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(customerNumber, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.orderNumber = null;
    } else {
    this.orderNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.orderDate = null;
    } else {
    this.orderDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.requiredDate = null;
    } else {
    this.requiredDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.shippedDate = null;
    } else {
    this.shippedDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.comments = null;
    } else {
    this.comments = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customerNumber = null;
    } else {
    this.customerNumber = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.orderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderNumber);
    }
    if (null == this.orderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.orderDate.getTime());
    }
    if (null == this.requiredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.requiredDate.getTime());
    }
    if (null == this.shippedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shippedDate.getTime());
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comments);
    }
    if (null == this.customerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customerNumber);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.orderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.orderNumber);
    }
    if (null == this.orderDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.orderDate.getTime());
    }
    if (null == this.requiredDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.requiredDate.getTime());
    }
    if (null == this.shippedDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.shippedDate.getTime());
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comments);
    }
    if (null == this.customerNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customerNumber);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(orderNumber==null?"null":"" + orderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orderDate==null?"null":"" + orderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requiredDate==null?"null":"" + requiredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shippedDate==null?"null":"" + shippedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comments==null?"null":comments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customerNumber==null?"null":"" + customerNumber, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(orderNumber==null?"null":"" + orderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orderDate==null?"null":"" + orderDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requiredDate==null?"null":"" + requiredDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shippedDate==null?"null":"" + shippedDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comments==null?"null":comments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customerNumber==null?"null":"" + customerNumber, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderNumber = null; } else {
      this.orderNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderDate = null; } else {
      this.orderDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.requiredDate = null; } else {
      this.requiredDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shippedDate = null; } else {
      this.shippedDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.comments = null; } else {
      this.comments = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customerNumber = null; } else {
      this.customerNumber = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderNumber = null; } else {
      this.orderNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.orderDate = null; } else {
      this.orderDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.requiredDate = null; } else {
      this.requiredDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shippedDate = null; } else {
      this.shippedDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.comments = null; } else {
      this.comments = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customerNumber = null; } else {
      this.customerNumber = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    orders o = (orders) super.clone();
    o.orderDate = (o.orderDate != null) ? (java.sql.Date) o.orderDate.clone() : null;
    o.requiredDate = (o.requiredDate != null) ? (java.sql.Date) o.requiredDate.clone() : null;
    o.shippedDate = (o.shippedDate != null) ? (java.sql.Date) o.shippedDate.clone() : null;
    return o;
  }

  public void clone0(orders o) throws CloneNotSupportedException {
    o.orderDate = (o.orderDate != null) ? (java.sql.Date) o.orderDate.clone() : null;
    o.requiredDate = (o.requiredDate != null) ? (java.sql.Date) o.requiredDate.clone() : null;
    o.shippedDate = (o.shippedDate != null) ? (java.sql.Date) o.shippedDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("orderNumber", this.orderNumber);
    __sqoop$field_map.put("orderDate", this.orderDate);
    __sqoop$field_map.put("requiredDate", this.requiredDate);
    __sqoop$field_map.put("shippedDate", this.shippedDate);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("comments", this.comments);
    __sqoop$field_map.put("customerNumber", this.customerNumber);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("orderNumber", this.orderNumber);
    __sqoop$field_map.put("orderDate", this.orderDate);
    __sqoop$field_map.put("requiredDate", this.requiredDate);
    __sqoop$field_map.put("shippedDate", this.shippedDate);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("comments", this.comments);
    __sqoop$field_map.put("customerNumber", this.customerNumber);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
