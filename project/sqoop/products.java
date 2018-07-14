// ORM class for table 'products'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 13 00:39:56 UTC 2018
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

public class products extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("productCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productCode = (String)value;
      }
    });
    setters.put("productName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productName = (String)value;
      }
    });
    setters.put("productLine", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productLine = (String)value;
      }
    });
    setters.put("productScale", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productScale = (String)value;
      }
    });
    setters.put("productVendor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productVendor = (String)value;
      }
    });
    setters.put("productDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.productDescription = (String)value;
      }
    });
    setters.put("quantityInStock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.quantityInStock = (Integer)value;
      }
    });
    setters.put("buyPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.buyPrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("MSRP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        products.this.MSRP = (java.math.BigDecimal)value;
      }
    });
  }
  public products() {
    init0();
  }
  private String productCode;
  public String get_productCode() {
    return productCode;
  }
  public void set_productCode(String productCode) {
    this.productCode = productCode;
  }
  public products with_productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }
  private String productName;
  public String get_productName() {
    return productName;
  }
  public void set_productName(String productName) {
    this.productName = productName;
  }
  public products with_productName(String productName) {
    this.productName = productName;
    return this;
  }
  private String productLine;
  public String get_productLine() {
    return productLine;
  }
  public void set_productLine(String productLine) {
    this.productLine = productLine;
  }
  public products with_productLine(String productLine) {
    this.productLine = productLine;
    return this;
  }
  private String productScale;
  public String get_productScale() {
    return productScale;
  }
  public void set_productScale(String productScale) {
    this.productScale = productScale;
  }
  public products with_productScale(String productScale) {
    this.productScale = productScale;
    return this;
  }
  private String productVendor;
  public String get_productVendor() {
    return productVendor;
  }
  public void set_productVendor(String productVendor) {
    this.productVendor = productVendor;
  }
  public products with_productVendor(String productVendor) {
    this.productVendor = productVendor;
    return this;
  }
  private String productDescription;
  public String get_productDescription() {
    return productDescription;
  }
  public void set_productDescription(String productDescription) {
    this.productDescription = productDescription;
  }
  public products with_productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }
  private Integer quantityInStock;
  public Integer get_quantityInStock() {
    return quantityInStock;
  }
  public void set_quantityInStock(Integer quantityInStock) {
    this.quantityInStock = quantityInStock;
  }
  public products with_quantityInStock(Integer quantityInStock) {
    this.quantityInStock = quantityInStock;
    return this;
  }
  private java.math.BigDecimal buyPrice;
  public java.math.BigDecimal get_buyPrice() {
    return buyPrice;
  }
  public void set_buyPrice(java.math.BigDecimal buyPrice) {
    this.buyPrice = buyPrice;
  }
  public products with_buyPrice(java.math.BigDecimal buyPrice) {
    this.buyPrice = buyPrice;
    return this;
  }
  private java.math.BigDecimal MSRP;
  public java.math.BigDecimal get_MSRP() {
    return MSRP;
  }
  public void set_MSRP(java.math.BigDecimal MSRP) {
    this.MSRP = MSRP;
  }
  public products with_MSRP(java.math.BigDecimal MSRP) {
    this.MSRP = MSRP;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products)) {
      return false;
    }
    products that = (products) o;
    boolean equal = true;
    equal = equal && (this.productCode == null ? that.productCode == null : this.productCode.equals(that.productCode));
    equal = equal && (this.productName == null ? that.productName == null : this.productName.equals(that.productName));
    equal = equal && (this.productLine == null ? that.productLine == null : this.productLine.equals(that.productLine));
    equal = equal && (this.productScale == null ? that.productScale == null : this.productScale.equals(that.productScale));
    equal = equal && (this.productVendor == null ? that.productVendor == null : this.productVendor.equals(that.productVendor));
    equal = equal && (this.productDescription == null ? that.productDescription == null : this.productDescription.equals(that.productDescription));
    equal = equal && (this.quantityInStock == null ? that.quantityInStock == null : this.quantityInStock.equals(that.quantityInStock));
    equal = equal && (this.buyPrice == null ? that.buyPrice == null : this.buyPrice.equals(that.buyPrice));
    equal = equal && (this.MSRP == null ? that.MSRP == null : this.MSRP.equals(that.MSRP));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products)) {
      return false;
    }
    products that = (products) o;
    boolean equal = true;
    equal = equal && (this.productCode == null ? that.productCode == null : this.productCode.equals(that.productCode));
    equal = equal && (this.productName == null ? that.productName == null : this.productName.equals(that.productName));
    equal = equal && (this.productLine == null ? that.productLine == null : this.productLine.equals(that.productLine));
    equal = equal && (this.productScale == null ? that.productScale == null : this.productScale.equals(that.productScale));
    equal = equal && (this.productVendor == null ? that.productVendor == null : this.productVendor.equals(that.productVendor));
    equal = equal && (this.productDescription == null ? that.productDescription == null : this.productDescription.equals(that.productDescription));
    equal = equal && (this.quantityInStock == null ? that.quantityInStock == null : this.quantityInStock.equals(that.quantityInStock));
    equal = equal && (this.buyPrice == null ? that.buyPrice == null : this.buyPrice.equals(that.buyPrice));
    equal = equal && (this.MSRP == null ? that.MSRP == null : this.MSRP.equals(that.MSRP));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.productCode = JdbcWritableBridge.readString(1, __dbResults);
    this.productName = JdbcWritableBridge.readString(2, __dbResults);
    this.productLine = JdbcWritableBridge.readString(3, __dbResults);
    this.productScale = JdbcWritableBridge.readString(4, __dbResults);
    this.productVendor = JdbcWritableBridge.readString(5, __dbResults);
    this.productDescription = JdbcWritableBridge.readString(6, __dbResults);
    this.quantityInStock = JdbcWritableBridge.readInteger(7, __dbResults);
    this.buyPrice = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.MSRP = JdbcWritableBridge.readBigDecimal(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.productCode = JdbcWritableBridge.readString(1, __dbResults);
    this.productName = JdbcWritableBridge.readString(2, __dbResults);
    this.productLine = JdbcWritableBridge.readString(3, __dbResults);
    this.productScale = JdbcWritableBridge.readString(4, __dbResults);
    this.productVendor = JdbcWritableBridge.readString(5, __dbResults);
    this.productDescription = JdbcWritableBridge.readString(6, __dbResults);
    this.quantityInStock = JdbcWritableBridge.readInteger(7, __dbResults);
    this.buyPrice = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.MSRP = JdbcWritableBridge.readBigDecimal(9, __dbResults);
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
    JdbcWritableBridge.writeString(productCode, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productLine, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productScale, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productVendor, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productDescription, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(quantityInStock, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(buyPrice, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MSRP, 9 + __off, 3, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(productCode, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productName, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productLine, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productScale, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productVendor, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productDescription, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(quantityInStock, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(buyPrice, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MSRP, 9 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.productCode = null;
    } else {
    this.productCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productName = null;
    } else {
    this.productName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productLine = null;
    } else {
    this.productLine = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productScale = null;
    } else {
    this.productScale = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productVendor = null;
    } else {
    this.productVendor = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productDescription = null;
    } else {
    this.productDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.quantityInStock = null;
    } else {
    this.quantityInStock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.buyPrice = null;
    } else {
    this.buyPrice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MSRP = null;
    } else {
    this.MSRP = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.productCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productCode);
    }
    if (null == this.productName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productName);
    }
    if (null == this.productLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productLine);
    }
    if (null == this.productScale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productScale);
    }
    if (null == this.productVendor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productVendor);
    }
    if (null == this.productDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productDescription);
    }
    if (null == this.quantityInStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantityInStock);
    }
    if (null == this.buyPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.buyPrice, __dataOut);
    }
    if (null == this.MSRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MSRP, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.productCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productCode);
    }
    if (null == this.productName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productName);
    }
    if (null == this.productLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productLine);
    }
    if (null == this.productScale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productScale);
    }
    if (null == this.productVendor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productVendor);
    }
    if (null == this.productDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productDescription);
    }
    if (null == this.quantityInStock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantityInStock);
    }
    if (null == this.buyPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.buyPrice, __dataOut);
    }
    if (null == this.MSRP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MSRP, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 34, (char) 0, true);
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
    __sb.append(FieldFormatter.escapeAndEnclose(productCode==null?"null":productCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productName==null?"null":productName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productLine==null?"null":productLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productScale==null?"null":productScale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productVendor==null?"null":productVendor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productDescription==null?"null":productDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantityInStock==null?"null":"" + quantityInStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buyPrice==null?"null":buyPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MSRP==null?"null":MSRP.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(productCode==null?"null":productCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productName==null?"null":productName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productLine==null?"null":productLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productScale==null?"null":productScale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productVendor==null?"null":productVendor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productDescription==null?"null":productDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantityInStock==null?"null":"" + quantityInStock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buyPrice==null?"null":buyPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MSRP==null?"null":MSRP.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 34, (char) 0, true);
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
    if (__cur_str.equals("null")) { this.productCode = null; } else {
      this.productCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productName = null; } else {
      this.productName = __cur_str;
    }

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
    if (__cur_str.equals("null")) { this.productScale = null; } else {
      this.productScale = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productVendor = null; } else {
      this.productVendor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productDescription = null; } else {
      this.productDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantityInStock = null; } else {
      this.quantityInStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buyPrice = null; } else {
      this.buyPrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MSRP = null; } else {
      this.MSRP = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.productCode = null; } else {
      this.productCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productName = null; } else {
      this.productName = __cur_str;
    }

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
    if (__cur_str.equals("null")) { this.productScale = null; } else {
      this.productScale = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productVendor = null; } else {
      this.productVendor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.productDescription = null; } else {
      this.productDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantityInStock = null; } else {
      this.quantityInStock = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buyPrice = null; } else {
      this.buyPrice = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MSRP = null; } else {
      this.MSRP = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    products o = (products) super.clone();
    return o;
  }

  public void clone0(products o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("productCode", this.productCode);
    __sqoop$field_map.put("productName", this.productName);
    __sqoop$field_map.put("productLine", this.productLine);
    __sqoop$field_map.put("productScale", this.productScale);
    __sqoop$field_map.put("productVendor", this.productVendor);
    __sqoop$field_map.put("productDescription", this.productDescription);
    __sqoop$field_map.put("quantityInStock", this.quantityInStock);
    __sqoop$field_map.put("buyPrice", this.buyPrice);
    __sqoop$field_map.put("MSRP", this.MSRP);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("productCode", this.productCode);
    __sqoop$field_map.put("productName", this.productName);
    __sqoop$field_map.put("productLine", this.productLine);
    __sqoop$field_map.put("productScale", this.productScale);
    __sqoop$field_map.put("productVendor", this.productVendor);
    __sqoop$field_map.put("productDescription", this.productDescription);
    __sqoop$field_map.put("quantityInStock", this.quantityInStock);
    __sqoop$field_map.put("buyPrice", this.buyPrice);
    __sqoop$field_map.put("MSRP", this.MSRP);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
