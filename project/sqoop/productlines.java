// ORM class for table 'productlines'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jul 05 04:09:49 UTC 2018
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

public class productlines extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("productLine", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productlines.this.productLine = (String)value;
      }
    });
    setters.put("textDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productlines.this.textDescription = (String)value;
      }
    });
    setters.put("htmlDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productlines.this.htmlDescription = (String)value;
      }
    });
    setters.put("image", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productlines.this.image = (com.cloudera.sqoop.lib.BlobRef)value;
      }
    });
  }
  public productlines() {
    init0();
  }
  private String productLine;
  public String get_productLine() {
    return productLine;
  }
  public void set_productLine(String productLine) {
    this.productLine = productLine;
  }
  public productlines with_productLine(String productLine) {
    this.productLine = productLine;
    return this;
  }
  private String textDescription;
  public String get_textDescription() {
    return textDescription;
  }
  public void set_textDescription(String textDescription) {
    this.textDescription = textDescription;
  }
  public productlines with_textDescription(String textDescription) {
    this.textDescription = textDescription;
    return this;
  }
  private String htmlDescription;
  public String get_htmlDescription() {
    return htmlDescription;
  }
  public void set_htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }
  public productlines with_htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }
  private com.cloudera.sqoop.lib.BlobRef image;
  public com.cloudera.sqoop.lib.BlobRef get_image() {
    return image;
  }
  public void set_image(com.cloudera.sqoop.lib.BlobRef image) {
    this.image = image;
  }
  public productlines with_image(com.cloudera.sqoop.lib.BlobRef image) {
    this.image = image;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof productlines)) {
      return false;
    }
    productlines that = (productlines) o;
    boolean equal = true;
    equal = equal && (this.productLine == null ? that.productLine == null : this.productLine.equals(that.productLine));
    equal = equal && (this.textDescription == null ? that.textDescription == null : this.textDescription.equals(that.textDescription));
    equal = equal && (this.htmlDescription == null ? that.htmlDescription == null : this.htmlDescription.equals(that.htmlDescription));
    equal = equal && (this.image == null ? that.image == null : this.image.equals(that.image));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof productlines)) {
      return false;
    }
    productlines that = (productlines) o;
    boolean equal = true;
    equal = equal && (this.productLine == null ? that.productLine == null : this.productLine.equals(that.productLine));
    equal = equal && (this.textDescription == null ? that.textDescription == null : this.textDescription.equals(that.textDescription));
    equal = equal && (this.htmlDescription == null ? that.htmlDescription == null : this.htmlDescription.equals(that.htmlDescription));
    equal = equal && (this.image == null ? that.image == null : this.image.equals(that.image));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.productLine = JdbcWritableBridge.readString(1, __dbResults);
    this.textDescription = JdbcWritableBridge.readString(2, __dbResults);
    this.htmlDescription = JdbcWritableBridge.readString(3, __dbResults);
    this.image = JdbcWritableBridge.readBlobRef(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.productLine = JdbcWritableBridge.readString(1, __dbResults);
    this.textDescription = JdbcWritableBridge.readString(2, __dbResults);
    this.htmlDescription = JdbcWritableBridge.readString(3, __dbResults);
    this.image = JdbcWritableBridge.readBlobRef(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.image = __loader.readBlobRef(4, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.image = __loader.readBlobRef(4, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(productLine, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(textDescription, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(htmlDescription, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBlobRef(image, 4 + __off, -4, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(productLine, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(textDescription, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(htmlDescription, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeBlobRef(image, 4 + __off, -4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.productLine = null;
    } else {
    this.productLine = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.textDescription = null;
    } else {
    this.textDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.htmlDescription = null;
    } else {
    this.htmlDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.image = null;
    } else {
    this.image = com.cloudera.sqoop.lib.LobSerializer.readBlobFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.productLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productLine);
    }
    if (null == this.textDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, textDescription);
    }
    if (null == this.htmlDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, htmlDescription);
    }
    if (null == this.image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.image, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.productLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productLine);
    }
    if (null == this.textDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, textDescription);
    }
    if (null == this.htmlDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, htmlDescription);
    }
    if (null == this.image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.image, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(productLine==null?"null":productLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(textDescription==null?"null":textDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(htmlDescription==null?"null":htmlDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(image==null?"null":"" + image, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(productLine==null?"null":productLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(textDescription==null?"null":textDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(htmlDescription==null?"null":htmlDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(image==null?"null":"" + image, delimiters));
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
    if (__cur_str.equals("null")) { this.productLine = null; } else {
      this.productLine = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.textDescription = null; } else {
      this.textDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.htmlDescription = null; } else {
      this.htmlDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.image = null; } else {
      this.image = BlobRef.parse(__cur_str);
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
    if (__cur_str.equals("null")) { this.productLine = null; } else {
      this.productLine = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.textDescription = null; } else {
      this.textDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.htmlDescription = null; } else {
      this.htmlDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.image = null; } else {
      this.image = BlobRef.parse(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    productlines o = (productlines) super.clone();
    o.image = (o.image != null) ? (com.cloudera.sqoop.lib.BlobRef) o.image.clone() : null;
    return o;
  }

  public void clone0(productlines o) throws CloneNotSupportedException {
    o.image = (o.image != null) ? (com.cloudera.sqoop.lib.BlobRef) o.image.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("productLine", this.productLine);
    __sqoop$field_map.put("textDescription", this.textDescription);
    __sqoop$field_map.put("htmlDescription", this.htmlDescription);
    __sqoop$field_map.put("image", this.image);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("productLine", this.productLine);
    __sqoop$field_map.put("textDescription", this.textDescription);
    __sqoop$field_map.put("htmlDescription", this.htmlDescription);
    __sqoop$field_map.put("image", this.image);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
