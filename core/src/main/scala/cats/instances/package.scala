package cats

package object instances {
  object all             extends AllInstances with AllInstancesBinCompat0
  object bigInt          extends BigIntInstances
  object bigDecimal      extends BigDecimalInstances
  object bitSet          extends BitSetInstances
  object boolean         extends BooleanInstances
  object byte            extends ByteInstances
  object char            extends CharInstances
  object double          extends DoubleInstances
  object duration        extends DurationInstances
  object either          extends EitherInstances
  object eq              extends EqInstances
  object equiv           extends EquivInstances
  object float           extends FloatInstances
  object function        extends FunctionInstances
                         with    FunctionInstancesBinCompat0
  object future          extends FutureInstances
  object int             extends IntInstances
  object invariant       extends InvariantMonoidalInstances
  object list            extends ListInstances
  object long            extends LongInstances
  object map             extends MapInstances
  object option          extends OptionInstances
  object order           extends OrderInstances
  object ordering        extends OrderingInstances
  object parallel        extends ParallelInstances
  object partialOrder    extends PartialOrderInstances
  object partialOrdering extends PartialOrderingInstances
  object queue           extends QueueInstances
  object set             extends SetInstances
  object short           extends ShortInstances
  object sortedMap       extends SortedMapInstances
  object sortedSet       extends SortedSetInstances
  object stream          extends StreamInstances
  object string          extends StringInstances
  object try_            extends TryInstances
  object tuple           extends TupleInstances
                         with    Tuple2InstancesBinCompat0
  object unit            extends UnitInstances
  object uuid            extends UUIDInstances
  object vector          extends VectorInstances
}
