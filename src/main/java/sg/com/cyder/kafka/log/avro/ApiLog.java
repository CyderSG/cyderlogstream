/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package sg.com.cyder.kafka.log.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ApiLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6043466928051304833L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ApiLog\",\"namespace\":\"sg.com.cyder.kafka.log.avro\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"category\",\"type\":\"string\"},{\"name\":\"level\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"},{\"name\":\"detail\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ApiLog> ENCODER =
      new BinaryMessageEncoder<ApiLog>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ApiLog> DECODER =
      new BinaryMessageDecoder<ApiLog>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ApiLog> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ApiLog> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ApiLog> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ApiLog>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ApiLog to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ApiLog from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ApiLog instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ApiLog fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long timestamp;
   private java.lang.CharSequence host;
   private java.lang.CharSequence category;
   private java.lang.CharSequence level;
   private java.lang.CharSequence message;
   private java.lang.CharSequence detail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ApiLog() {}

  /**
   * All-args constructor.
   * @param timestamp The new value for timestamp
   * @param host The new value for host
   * @param category The new value for category
   * @param level The new value for level
   * @param message The new value for message
   * @param detail The new value for detail
   */
  public ApiLog(java.lang.Long timestamp, java.lang.CharSequence host, java.lang.CharSequence category, java.lang.CharSequence level, java.lang.CharSequence message, java.lang.CharSequence detail) {
    this.timestamp = timestamp;
    this.host = host;
    this.category = category;
    this.level = level;
    this.message = message;
    this.detail = detail;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return host;
    case 2: return category;
    case 3: return level;
    case 4: return message;
    case 5: return detail;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: host = (java.lang.CharSequence)value$; break;
    case 2: category = (java.lang.CharSequence)value$; break;
    case 3: level = (java.lang.CharSequence)value$; break;
    case 4: message = (java.lang.CharSequence)value$; break;
    case 5: detail = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'host' field.
   * @return The value of the 'host' field.
   */
  public java.lang.CharSequence getHost() {
    return host;
  }


  /**
   * Sets the value of the 'host' field.
   * @param value the value to set.
   */
  public void setHost(java.lang.CharSequence value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.CharSequence getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.CharSequence value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'level' field.
   * @return The value of the 'level' field.
   */
  public java.lang.CharSequence getLevel() {
    return level;
  }


  /**
   * Sets the value of the 'level' field.
   * @param value the value to set.
   */
  public void setLevel(java.lang.CharSequence value) {
    this.level = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Gets the value of the 'detail' field.
   * @return The value of the 'detail' field.
   */
  public java.lang.CharSequence getDetail() {
    return detail;
  }


  /**
   * Sets the value of the 'detail' field.
   * @param value the value to set.
   */
  public void setDetail(java.lang.CharSequence value) {
    this.detail = value;
  }

  /**
   * Creates a new ApiLog RecordBuilder.
   * @return A new ApiLog RecordBuilder
   */
  public static sg.com.cyder.kafka.log.avro.ApiLog.Builder newBuilder() {
    return new sg.com.cyder.kafka.log.avro.ApiLog.Builder();
  }

  /**
   * Creates a new ApiLog RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ApiLog RecordBuilder
   */
  public static sg.com.cyder.kafka.log.avro.ApiLog.Builder newBuilder(sg.com.cyder.kafka.log.avro.ApiLog.Builder other) {
    if (other == null) {
      return new sg.com.cyder.kafka.log.avro.ApiLog.Builder();
    } else {
      return new sg.com.cyder.kafka.log.avro.ApiLog.Builder(other);
    }
  }

  /**
   * Creates a new ApiLog RecordBuilder by copying an existing ApiLog instance.
   * @param other The existing instance to copy.
   * @return A new ApiLog RecordBuilder
   */
  public static sg.com.cyder.kafka.log.avro.ApiLog.Builder newBuilder(sg.com.cyder.kafka.log.avro.ApiLog other) {
    if (other == null) {
      return new sg.com.cyder.kafka.log.avro.ApiLog.Builder();
    } else {
      return new sg.com.cyder.kafka.log.avro.ApiLog.Builder(other);
    }
  }

  /**
   * RecordBuilder for ApiLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ApiLog>
    implements org.apache.avro.data.RecordBuilder<ApiLog> {

    private long timestamp;
    private java.lang.CharSequence host;
    private java.lang.CharSequence category;
    private java.lang.CharSequence level;
    private java.lang.CharSequence message;
    private java.lang.CharSequence detail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(sg.com.cyder.kafka.log.avro.ApiLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.host)) {
        this.host = data().deepCopy(fields()[1].schema(), other.host);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.category)) {
        this.category = data().deepCopy(fields()[2].schema(), other.category);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.level)) {
        this.level = data().deepCopy(fields()[3].schema(), other.level);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.message)) {
        this.message = data().deepCopy(fields()[4].schema(), other.message);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.detail)) {
        this.detail = data().deepCopy(fields()[5].schema(), other.detail);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing ApiLog instance
     * @param other The existing instance to copy.
     */
    private Builder(sg.com.cyder.kafka.log.avro.ApiLog other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.host)) {
        this.host = data().deepCopy(fields()[1].schema(), other.host);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.category)) {
        this.category = data().deepCopy(fields()[2].schema(), other.category);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.level)) {
        this.level = data().deepCopy(fields()[3].schema(), other.level);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.message)) {
        this.message = data().deepCopy(fields()[4].schema(), other.message);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.detail)) {
        this.detail = data().deepCopy(fields()[5].schema(), other.detail);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'host' field.
      * @return The value.
      */
    public java.lang.CharSequence getHost() {
      return host;
    }


    /**
      * Sets the value of the 'host' field.
      * @param value The value of 'host'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setHost(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.host = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'host' field has been set.
      * @return True if the 'host' field has been set, false otherwise.
      */
    public boolean hasHost() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'host' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearHost() {
      host = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.CharSequence getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setCategory(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.category = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearCategory() {
      category = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'level' field.
      * @return The value.
      */
    public java.lang.CharSequence getLevel() {
      return level;
    }


    /**
      * Sets the value of the 'level' field.
      * @param value The value of 'level'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setLevel(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.level = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'level' field has been set.
      * @return True if the 'level' field has been set, false otherwise.
      */
    public boolean hasLevel() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'level' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearLevel() {
      level = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.message = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearMessage() {
      message = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'detail' field.
      * @return The value.
      */
    public java.lang.CharSequence getDetail() {
      return detail;
    }


    /**
      * Sets the value of the 'detail' field.
      * @param value The value of 'detail'.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder setDetail(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.detail = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'detail' field has been set.
      * @return True if the 'detail' field has been set, false otherwise.
      */
    public boolean hasDetail() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'detail' field.
      * @return This builder.
      */
    public sg.com.cyder.kafka.log.avro.ApiLog.Builder clearDetail() {
      detail = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @SuppressWarnings("unchecked")
    public ApiLog build() {
      try {
        ApiLog record = new ApiLog();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        record.host = fieldSetFlags()[1] ? this.host : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.category = fieldSetFlags()[2] ? this.category : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.level = fieldSetFlags()[3] ? this.level : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.message = fieldSetFlags()[4] ? this.message : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.detail = fieldSetFlags()[5] ? this.detail : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ApiLog>
    WRITER$ = (org.apache.avro.io.DatumWriter<ApiLog>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ApiLog>
    READER$ = (org.apache.avro.io.DatumReader<ApiLog>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.timestamp);

    out.writeString(this.host);

    out.writeString(this.category);

    out.writeString(this.level);

    out.writeString(this.message);

    out.writeString(this.detail);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.timestamp = in.readLong();

      this.host = in.readString(this.host instanceof Utf8 ? (Utf8)this.host : null);

      this.category = in.readString(this.category instanceof Utf8 ? (Utf8)this.category : null);

      this.level = in.readString(this.level instanceof Utf8 ? (Utf8)this.level : null);

      this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);

      this.detail = in.readString(this.detail instanceof Utf8 ? (Utf8)this.detail : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.timestamp = in.readLong();
          break;

        case 1:
          this.host = in.readString(this.host instanceof Utf8 ? (Utf8)this.host : null);
          break;

        case 2:
          this.category = in.readString(this.category instanceof Utf8 ? (Utf8)this.category : null);
          break;

        case 3:
          this.level = in.readString(this.level instanceof Utf8 ? (Utf8)this.level : null);
          break;

        case 4:
          this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);
          break;

        case 5:
          this.detail = in.readString(this.detail instanceof Utf8 ? (Utf8)this.detail : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










