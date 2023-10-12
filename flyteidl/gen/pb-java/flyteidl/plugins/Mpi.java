// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flyteidl/plugins/mpi.proto

package flyteidl.plugins;

public final class Mpi {
  private Mpi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DistributedMPITrainingTaskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:flyteidl.plugins.DistributedMPITrainingTask)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * number of worker spawned in the cluster for this job
     * </pre>
     *
     * <code>int32 num_workers = 1;</code>
     */
    int getNumWorkers();

    /**
     * <pre>
     * number of launcher replicas spawned in the cluster for this job
     * The launcher pod invokes mpirun and communicates with worker pods through MPI.
     * </pre>
     *
     * <code>int32 num_launcher_replicas = 2;</code>
     */
    int getNumLauncherReplicas();

    /**
     * <pre>
     * number of slots per worker used in hostfile.
     * The available slots (GPUs) in each pod.
     * </pre>
     *
     * <code>int32 slots = 3;</code>
     */
    int getSlots();
  }
  /**
   * <pre>
   * MPI operator proposal https://github.com/kubeflow/community/blob/master/proposals/mpi-operator-proposal.md
   * Custom proto for plugin that enables distributed training using https://github.com/kubeflow/mpi-operator
   * </pre>
   *
   * Protobuf type {@code flyteidl.plugins.DistributedMPITrainingTask}
   */
  public  static final class DistributedMPITrainingTask extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:flyteidl.plugins.DistributedMPITrainingTask)
      DistributedMPITrainingTaskOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DistributedMPITrainingTask.newBuilder() to construct.
    private DistributedMPITrainingTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DistributedMPITrainingTask() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DistributedMPITrainingTask(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              numWorkers_ = input.readInt32();
              break;
            }
            case 16: {

              numLauncherReplicas_ = input.readInt32();
              break;
            }
            case 24: {

              slots_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return flyteidl.plugins.Mpi.internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return flyteidl.plugins.Mpi.internal_static_flyteidl_plugins_DistributedMPITrainingTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              flyteidl.plugins.Mpi.DistributedMPITrainingTask.class, flyteidl.plugins.Mpi.DistributedMPITrainingTask.Builder.class);
    }

    public static final int NUM_WORKERS_FIELD_NUMBER = 1;
    private int numWorkers_;
    /**
     * <pre>
     * number of worker spawned in the cluster for this job
     * </pre>
     *
     * <code>int32 num_workers = 1;</code>
     */
    public int getNumWorkers() {
      return numWorkers_;
    }

    public static final int NUM_LAUNCHER_REPLICAS_FIELD_NUMBER = 2;
    private int numLauncherReplicas_;
    /**
     * <pre>
     * number of launcher replicas spawned in the cluster for this job
     * The launcher pod invokes mpirun and communicates with worker pods through MPI.
     * </pre>
     *
     * <code>int32 num_launcher_replicas = 2;</code>
     */
    public int getNumLauncherReplicas() {
      return numLauncherReplicas_;
    }

    public static final int SLOTS_FIELD_NUMBER = 3;
    private int slots_;
    /**
     * <pre>
     * number of slots per worker used in hostfile.
     * The available slots (GPUs) in each pod.
     * </pre>
     *
     * <code>int32 slots = 3;</code>
     */
    public int getSlots() {
      return slots_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (numWorkers_ != 0) {
        output.writeInt32(1, numWorkers_);
      }
      if (numLauncherReplicas_ != 0) {
        output.writeInt32(2, numLauncherReplicas_);
      }
      if (slots_ != 0) {
        output.writeInt32(3, slots_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (numWorkers_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, numWorkers_);
      }
      if (numLauncherReplicas_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, numLauncherReplicas_);
      }
      if (slots_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, slots_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof flyteidl.plugins.Mpi.DistributedMPITrainingTask)) {
        return super.equals(obj);
      }
      flyteidl.plugins.Mpi.DistributedMPITrainingTask other = (flyteidl.plugins.Mpi.DistributedMPITrainingTask) obj;

      if (getNumWorkers()
          != other.getNumWorkers()) return false;
      if (getNumLauncherReplicas()
          != other.getNumLauncherReplicas()) return false;
      if (getSlots()
          != other.getSlots()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUM_WORKERS_FIELD_NUMBER;
      hash = (53 * hash) + getNumWorkers();
      hash = (37 * hash) + NUM_LAUNCHER_REPLICAS_FIELD_NUMBER;
      hash = (53 * hash) + getNumLauncherReplicas();
      hash = (37 * hash) + SLOTS_FIELD_NUMBER;
      hash = (53 * hash) + getSlots();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(flyteidl.plugins.Mpi.DistributedMPITrainingTask prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * MPI operator proposal https://github.com/kubeflow/community/blob/master/proposals/mpi-operator-proposal.md
     * Custom proto for plugin that enables distributed training using https://github.com/kubeflow/mpi-operator
     * </pre>
     *
     * Protobuf type {@code flyteidl.plugins.DistributedMPITrainingTask}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:flyteidl.plugins.DistributedMPITrainingTask)
        flyteidl.plugins.Mpi.DistributedMPITrainingTaskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return flyteidl.plugins.Mpi.internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return flyteidl.plugins.Mpi.internal_static_flyteidl_plugins_DistributedMPITrainingTask_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                flyteidl.plugins.Mpi.DistributedMPITrainingTask.class, flyteidl.plugins.Mpi.DistributedMPITrainingTask.Builder.class);
      }

      // Construct using flyteidl.plugins.Mpi.DistributedMPITrainingTask.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        numWorkers_ = 0;

        numLauncherReplicas_ = 0;

        slots_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return flyteidl.plugins.Mpi.internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor;
      }

      @java.lang.Override
      public flyteidl.plugins.Mpi.DistributedMPITrainingTask getDefaultInstanceForType() {
        return flyteidl.plugins.Mpi.DistributedMPITrainingTask.getDefaultInstance();
      }

      @java.lang.Override
      public flyteidl.plugins.Mpi.DistributedMPITrainingTask build() {
        flyteidl.plugins.Mpi.DistributedMPITrainingTask result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public flyteidl.plugins.Mpi.DistributedMPITrainingTask buildPartial() {
        flyteidl.plugins.Mpi.DistributedMPITrainingTask result = new flyteidl.plugins.Mpi.DistributedMPITrainingTask(this);
        result.numWorkers_ = numWorkers_;
        result.numLauncherReplicas_ = numLauncherReplicas_;
        result.slots_ = slots_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof flyteidl.plugins.Mpi.DistributedMPITrainingTask) {
          return mergeFrom((flyteidl.plugins.Mpi.DistributedMPITrainingTask)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(flyteidl.plugins.Mpi.DistributedMPITrainingTask other) {
        if (other == flyteidl.plugins.Mpi.DistributedMPITrainingTask.getDefaultInstance()) return this;
        if (other.getNumWorkers() != 0) {
          setNumWorkers(other.getNumWorkers());
        }
        if (other.getNumLauncherReplicas() != 0) {
          setNumLauncherReplicas(other.getNumLauncherReplicas());
        }
        if (other.getSlots() != 0) {
          setSlots(other.getSlots());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        flyteidl.plugins.Mpi.DistributedMPITrainingTask parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (flyteidl.plugins.Mpi.DistributedMPITrainingTask) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int numWorkers_ ;
      /**
       * <pre>
       * number of worker spawned in the cluster for this job
       * </pre>
       *
       * <code>int32 num_workers = 1;</code>
       */
      public int getNumWorkers() {
        return numWorkers_;
      }
      /**
       * <pre>
       * number of worker spawned in the cluster for this job
       * </pre>
       *
       * <code>int32 num_workers = 1;</code>
       */
      public Builder setNumWorkers(int value) {
        
        numWorkers_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * number of worker spawned in the cluster for this job
       * </pre>
       *
       * <code>int32 num_workers = 1;</code>
       */
      public Builder clearNumWorkers() {
        
        numWorkers_ = 0;
        onChanged();
        return this;
      }

      private int numLauncherReplicas_ ;
      /**
       * <pre>
       * number of launcher replicas spawned in the cluster for this job
       * The launcher pod invokes mpirun and communicates with worker pods through MPI.
       * </pre>
       *
       * <code>int32 num_launcher_replicas = 2;</code>
       */
      public int getNumLauncherReplicas() {
        return numLauncherReplicas_;
      }
      /**
       * <pre>
       * number of launcher replicas spawned in the cluster for this job
       * The launcher pod invokes mpirun and communicates with worker pods through MPI.
       * </pre>
       *
       * <code>int32 num_launcher_replicas = 2;</code>
       */
      public Builder setNumLauncherReplicas(int value) {
        
        numLauncherReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * number of launcher replicas spawned in the cluster for this job
       * The launcher pod invokes mpirun and communicates with worker pods through MPI.
       * </pre>
       *
       * <code>int32 num_launcher_replicas = 2;</code>
       */
      public Builder clearNumLauncherReplicas() {
        
        numLauncherReplicas_ = 0;
        onChanged();
        return this;
      }

      private int slots_ ;
      /**
       * <pre>
       * number of slots per worker used in hostfile.
       * The available slots (GPUs) in each pod.
       * </pre>
       *
       * <code>int32 slots = 3;</code>
       */
      public int getSlots() {
        return slots_;
      }
      /**
       * <pre>
       * number of slots per worker used in hostfile.
       * The available slots (GPUs) in each pod.
       * </pre>
       *
       * <code>int32 slots = 3;</code>
       */
      public Builder setSlots(int value) {
        
        slots_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * number of slots per worker used in hostfile.
       * The available slots (GPUs) in each pod.
       * </pre>
       *
       * <code>int32 slots = 3;</code>
       */
      public Builder clearSlots() {
        
        slots_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:flyteidl.plugins.DistributedMPITrainingTask)
    }

    // @@protoc_insertion_point(class_scope:flyteidl.plugins.DistributedMPITrainingTask)
    private static final flyteidl.plugins.Mpi.DistributedMPITrainingTask DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new flyteidl.plugins.Mpi.DistributedMPITrainingTask();
    }

    public static flyteidl.plugins.Mpi.DistributedMPITrainingTask getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DistributedMPITrainingTask>
        PARSER = new com.google.protobuf.AbstractParser<DistributedMPITrainingTask>() {
      @java.lang.Override
      public DistributedMPITrainingTask parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DistributedMPITrainingTask(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DistributedMPITrainingTask> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DistributedMPITrainingTask> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public flyteidl.plugins.Mpi.DistributedMPITrainingTask getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flyteidl_plugins_DistributedMPITrainingTask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032flyteidl/plugins/mpi.proto\022\020flyteidl.p" +
      "lugins\"_\n\032DistributedMPITrainingTask\022\023\n\013" +
      "num_workers\030\001 \001(\005\022\035\n\025num_launcher_replic" +
      "as\030\002 \001(\005\022\r\n\005slots\030\003 \001(\005B?Z=github.com/fl" +
      "yteorg/flyte/flyteidl/gen/pb-go/flyteidl" +
      "/pluginsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_flyteidl_plugins_DistributedMPITrainingTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flyteidl_plugins_DistributedMPITrainingTask_descriptor,
        new java.lang.String[] { "NumWorkers", "NumLauncherReplicas", "Slots", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}