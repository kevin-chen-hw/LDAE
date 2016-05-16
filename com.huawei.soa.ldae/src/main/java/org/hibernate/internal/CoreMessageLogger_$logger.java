
package org.hibernate.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.sql.SQLWarning;
import java.util.Hashtable;
import javax.annotation.Generated;
import javax.naming.NameNotFoundException;
import javax.transaction.SystemException;
import org.hibernate.LockMode;
import org.hibernate.cache.CacheException;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolver;
import org.hibernate.engine.jndi.JndiNameException;
import org.hibernate.engine.loading.internal.CollectionLoadContext;
import org.hibernate.engine.loading.internal.EntityLoadContext;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.type.BasicType;
import org.hibernate.type.SerializationException;
import org.hibernate.type.Type;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2014-01-22T11:46:37-0600")
public class CoreMessageLogger_$logger
    extends DelegatingBasicLogger
    implements Serializable, CoreMessageLogger, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static java.lang.String FQCN = CoreMessageLogger_$logger.class.getName();
    private final static java.lang.String entityAnnotationOnNonRoot = "HHH000081: @org.hibernate.annotations.Entity used on a non root entity: ignored for %s";
    private final static java.lang.String unableToLogWarnings = "HHH000336: Could not log warnings";
    private final static java.lang.String writingGeneratedSchemaToFile = "HHH000417: Writing generated schema to file: %s";
    private final static java.lang.String secondLevelCachePuts = "HHH000239: Second level cache puts: %s";
    private final static java.lang.String creatingSubcontextInfo = "HHH000053: Creating subcontext: %s";
    private final static java.lang.String logicalConnectionReleasingPhysicalConnection = "HHH000163: Logical connection releasing its physical connection";
    private final static java.lang.String guidGenerated = "HHH000113: GUID identifier generated: %s";
    private final static java.lang.String logicalConnectionClosed = "HHH000162: *** Logical connection closed ***";
    private final static java.lang.String overridingTransactionStrategyDangerous = "HHH000193: Overriding %s is dangerous, this might break the EJB3 specification implementation";
    private final static java.lang.String startingServiceAtJndiName = "HHH000249: Starting service at JNDI name: %s";
    private final static java.lang.String entitiesInserted = "HHH000078: Entities inserted: %s";
    private final static java.lang.String entitiesUpdated = "HHH000080: Entities updated: %s";
    private final static java.lang.String legacyTransactionManagerStrategy = "HHH000428: Encountered legacy TransactionManagerLookup specified; convert to newer %s contract specified via %s setting";
    private final static java.lang.String unregisteredStatement = "HHH000387: ResultSet's statement was not registered";
    private final static java.lang.String tooManyInExpressions = "HHH000443: Dialect [%s] limits the number of elements in an IN predicate to %s entries.  However, the given parameter list [%s] contained %s entries, which will likely cause failures to execute the query in the database";
    private final static java.lang.String version = "HHH000412: Hibernate Core {%s}";
    private final static java.lang.String factoryBoundToJndiName = "HHH000094: Bound factory to JNDI name: %s";
    private final static java.lang.String unknownBytecodeProvider = "HHH000382: unrecognized bytecode provider [%s], using javassist by default";
    private final static java.lang.String secondLevelCacheHits = "HHH000237: Second level cache hits: %s";
    private final static java.lang.String illegalPropertySetterArgument = "HHH000123: IllegalArgumentException in class: %s, setter method of property: %s";
    private final static java.lang.String unableToDestroyQueryCache = "HHH000309: Unable to destroy query cache: %s: %s";
    private final static java.lang.String unsupportedProperty = "HHH000395: Usage of obsolete property: %s no longer supported, use: %s";
    private final static java.lang.String requiredDifferentProvider = "HHH000226: Required a different provider: %s";
    private final static java.lang.String unableToCreateProxyFactory = "HHH000305: Could not create proxy factory for:%s";
    private final static java.lang.String deprecatedOracle9Dialect = "HHH000063: The Oracle9Dialect dialect has been deprecated; use either Oracle9iDialect or Oracle10gDialect instead";
    private final static java.lang.String unableToObtainConnectionMetadata = "HHH000341: Could not obtain connection metadata : %s";
    private final static java.lang.String unableToClosePooledConnection = "HHH000293: Problem closing pooled connection";
    private final static java.lang.String disablingContextualLOBCreationSinceConnectionNull = "HHH000422: Disabling contextual LOB creation as connection was null";
    private final static java.lang.String schemaUpdateComplete = "HHH000232: Schema update complete";
    private final static java.lang.String naturalIdCacheHits = "HHH000439: NaturalId cache hits: %s";
    private final static java.lang.String usingStreams = "HHH000407: Using java.io streams to persist binary types";
    private final static java.lang.String alreadySessionBound = "HHH000002: Already session bound on call to bind(); make sure you clean up your sessions!";
    private final static java.lang.String disallowingInsertStatementComment = "HHH000067: Disallowing insert statement comment for select-identity due to Oracle driver bug";
    private final static java.lang.String unableToCloseOutputFile = "HHH000291: Error closing output file: %s";
    private final static java.lang.String loggingStatistics = "HHH000161: Logging statistics....";
    private final static java.lang.String unableToCompleteSchemaUpdate = "HHH000299: Could not complete schema update";
    private final static java.lang.String unableToLoadCommand = "HHH000327: Error performing load command : %s";
    private final static java.lang.String unableToDetermineLockModeValue = "HHH000311: Unable to determine lock mode value : %s -> %s";
    private final static java.lang.String aliasSpecificLockingWithFollowOnLocking = "HHH000445: Alias-specific lock modes requested, which is not currently supported with follow-on locking; all acquired locks will be [%s]";
    private final static java.lang.String definingFlushBeforeCompletionIgnoredInHem = "HHH000059: Defining %s=true ignored in HEM";
    private final static java.lang.String duplicateMetadata = "HHH000074: Found more than one <persistence-unit-metadata>, subsequent ignored";
    private final static java.lang.String orderByAnnotationIndexedCollection = "HHH000189: @OrderBy not allowed for an indexed collection, annotation ignored.";
    private final static java.lang.String packageNotFound = "HHH000194: Package not found or wo package-info.java: %s";
    private final static java.lang.String unableToRunSchemaUpdate = "HHH000366: Error running schema update";
    private final static java.lang.String compositeIdClassDoesNotOverrideEquals = "HHH000038: Composite-id class does not override equals(): %s";
    private final static java.lang.String schemaExportComplete = "HHH000230: Schema export complete";
    private final static java.lang.String unableToMarkForRollbackOnTransientObjectException = "HHH000338: Unable to mark for rollback on TransientObjectException: ";
    private final static java.lang.String serviceProperties = "HHH000240: Service properties: %s";
    private final static java.lang.String unableToLocateUuidGenerationStrategy = "HHH000334: Unable to locate requested UUID generation strategy class : %s";
    private final static java.lang.String naturalIdMaxQueryTime = "HHH000441: Max NaturalId query time: %sms";
    private final static java.lang.String entitiesDeleted = "HHH000076: Entities deleted: %s";
    private final static java.lang.String deprecatedManyToManyOuterJoin = "HHH000454: The outer-join attribute on <many-to-many> has been deprecated. Instead of outer-join=\"false\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    private final static java.lang.String unableToDeserializeCache = "HHH000307: Could not deserialize cache file: %s : %s";
    private final static java.lang.String unableToLoadScannedClassOrResource = "HHH000452: Exception while loading a class or resource found during scanning";
    private final static java.lang.String invalidSubStrategy = "HHH000138: Mixing inheritance strategy in a entity hierarchy is not allowed, ignoring sub strategy in: %s";
    private final static java.lang.String entityMappedAsNonAbstract = "HHH000084: Entity [%s] is abstract-class/interface explicitly mapped as non-abstract; be sure to supply entity-names";
    private final static java.lang.String unableToReleaseContext = "HHH000354: Unable to release initial context: %s";
    private final static java.lang.String unableToInstantiateOptimizer = "HHH000322: Unable to instantiate specified optimizer [%s], falling back to noop";
    private final static java.lang.String connectionProperties = "HHH000046: Connection properties: %s";
    private final static java.lang.String collectionsRecreated = "HHH000034: Collections recreated: %s";
    private final static java.lang.String unableToPerformJdbcCommit = "HHH000345: JDBC commit failed";
    private final static java.lang.String unableToCompleteSchemaValidation = "HHH000300: Could not complete schema validation";
    private final static java.lang.String bytecodeProvider = "HHH000021: Bytecode provider name : %s";
    private final static java.lang.String unsupportedMultiTableBulkHqlJpaql = "HHH000393: The %s.%s.%s version of H2 implements temporary table creation such that it commits current transaction; multi-table, bulk hql/jpaql will not work properly";
    private final static java.lang.String flushes = "HHH000105: Flushes: %s";
    private final static java.lang.String unableToDiscoverOsgiService = "HHH000453: Exception while discovering OSGi service implementations : %s";
    private final static java.lang.String honoringOptimizerSetting = "HHH000116: Config specified explicit optimizer of [%s], but [%s=%s; honoring optimizer setting";
    private final static java.lang.String unableToCleanUpCallableStatement = "HHH000281: Unable to clean up callable statement";
    private final static java.lang.String parsingXmlWarning = "HHH000198: Warning parsing XML (%s) : %s";
    private final static java.lang.String startTime = "HHH000251: Start time: %s";
    private final static java.lang.String writeLocksNotSupported = "HHH000416: Write locks via update not supported for non-versioned entities [%s]";
    private final static java.lang.String hibernateConnectionPoolSize = "HHH000115: Hibernate connection pool size: %s (min=%s)";
    private final static java.lang.String providerClassDeprecated = "HHH000208: %s has been deprecated in favor of %s; that provider will be used instead.";
    private final static java.lang.String proxoolProviderClassNotFound = "HHH000209: proxool properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    private final static java.lang.String unregisteredResultSetWithoutStatement = "HHH000386: ResultSet had no statement associated with it, but was not yet registered";
    private final static java.lang.String factoryUnboundFromName = "HHH000098: A factory was unbound from name: %s";
    private final static java.lang.String noPersistentClassesFound = "HHH000183: no persistent classes found for query class: %s";
    private final static java.lang.String settersOfLazyClassesCannotBeFinal = "HHH000243: Setters of lazy classes cannot be final: %s.%s";
    private final static java.lang.String unableToResolveAggregateFunction = "HHH000359: Could not resolve aggregate function [%s]; using standard definition";
    private final static java.lang.String hql = "HHH000117: HQL: %s, time: %sms, rows: %s";
    private final static java.lang.String foreignKeys = "HHH000108: Foreign keys: %s";
    private final static java.lang.String forcingTableUse = "HHH000107: Forcing table use for sequence-style generator due to pooled optimizer selection where db does not support pooled sequences";
    private final static java.lang.String readOnlyCacheConfiguredForMutableCollection = "HHH000222: read-only cache configured for mutable collection [%s]";
    private final static java.lang.String columns = "HHH000037: Columns: %s";
    private final static java.lang.String unsuccessful = "HHH000388: Unsuccessful: %s";
    private final static java.lang.String duplicateGeneratorName = "HHH000069: Duplicate generator name %s";
    private final static java.lang.String unsupportedInitialValue = "HHH000392: Hibernate does not support SequenceGenerator.initialValue() unless '%s' set";
    private final static java.lang.String unableToReleaseBatchStatement = "HHH000352: Unable to release batch statement...";
    private final static java.lang.String unableToReadHiValue = "HHH000350: Could not read a hi value - you need to populate the table: %s";
    private final static java.lang.String duplicateJoins = "HHH000072: Duplicate joins for class: %s";
    private final static java.lang.String startingUpdateTimestampsCache = "HHH000250: Starting update timestamps cache at region: %s";
    private final static java.lang.String unexpectedRowCounts = "HHH000381: JDBC driver did not return the expected number of row counts";
    private final static java.lang.String unableToRollbackConnection = "HHH000363: Unable to rollback connection on exception [%s]";
    private final static java.lang.String stoppingService = "HHH000255: Stopping service";
    private final static java.lang.String unableToLoadDerbyDriver = "HHH000328: Unable to load/access derby driver class sysinfo to check versions : %s";
    private final static java.lang.String jndiNameDoesNotHandleSessionFactoryReference = "HHH000155: JNDI name %s does not handle a session factory reference";
    private final static java.lang.String unableToRetrieveTypeInfoResultSet = "HHH000362: Unable to retrieve type info result set : %s";
    private final static java.lang.String autoCommitMode = "HHH000006: Autocommit mode: %s";
    private final static java.lang.String deprecatedForceDescriminatorAnnotation = "HHH000062: @ForceDiscriminator is deprecated use @DiscriminatorOptions instead.";
    private final static java.lang.String parsingXmlError = "HHH000196: Error parsing XML (%s) : %s";
    private final static java.lang.String unableToMarkForRollbackOnPersistenceException = "HHH000337: Unable to mark for rollback on PersistenceException: ";
    private final static java.lang.String unableToCloseStreamError = "HHH000297: Could not close stream on hibernate.properties: %s";
    private final static java.lang.String unableToConstructCurrentSessionContext = "HHH000302: Unable to construct current session context [%s]";
    private final static java.lang.String setManagerLookupClass = "HHH000426: You should set hibernate.transaction.jta.platform if cache is enabled";
    private final static java.lang.String exceptionInSubResolver = "HHH000089: Sub-resolver threw unexpected exception, continuing to next : %s";
    private final static java.lang.String unableToQueryDatabaseMetadata = "HHH000347: Unable to query java.sql.DatabaseMetaData";
    private final static java.lang.String entityManagerClosedBySomeoneElse = "HHH000082: Entity Manager closed by someone else (%s must not be used)";
    private final static java.lang.String connectionsObtained = "HHH000048: Connections obtained: %s";
    private final static java.lang.String unableToCloseConnection = "HHH000284: Error closing connection";
    private final static java.lang.String noAppropriateConnectionProvider = "HHH000181: No appropriate connection provider encountered, assuming application will be supplying connections";
    private final static java.lang.String unableToWriteCachedFile = "HHH000378: I/O reported error writing cached file : %s: %s";
    private final static java.lang.String hsqldbSupportsOnlyReadCommittedIsolation = "HHH000118: HSQLDB supports only READ_UNCOMMITTED isolation";
    private final static java.lang.String recognizedObsoleteHibernateNamespace = "HHH000223: Recognized obsolete hibernate namespace %s. Use namespace %s instead. Refer to Hibernate 3.6 Migration Guide!";
    private final static java.lang.String cannotResolveNonNullableTransientDependencies = "HHH000437: Attempting to save one or more entities that have a non-nullable association with an unsaved transient entity. The unsaved transient entity must be saved in an operation prior to saving these dependent entities.\n\tUnsaved transient entity: (%s)\n\tDependent entities: (%s)\n\tNon-nullable association(s): (%s)";
    private final static java.lang.String unableToCloseOutputStream = "HHH000292: IOException occurred closing output stream";
    private final static java.lang.String parsingXmlErrorForFile = "HHH000197: Error parsing XML: %s(%s) %s";
    private final static java.lang.String readingMappingsFromFile = "HHH000220: Reading mappings from file: %s";
    private final static java.lang.String usingDialect = "HHH000400: Using dialect: %s";
    private final static java.lang.String JavaSqlTypesMappedSameCodeMultipleTimes = "HHH000141: java.sql.Types mapped the same code [%s] multiple times; was [%s]; now [%s]";
    private final static java.lang.String unableToReleaseCreatedMBeanServer = "HHH000355: Unable to release created MBeanServer : %s";
    private final static java.lang.String deprecatedManyToManyFetch = "HHH000455: The fetch attribute on <many-to-many> has been deprecated. Instead of fetch=\"select\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    private final static java.lang.String entitiesFetched = "HHH000077: Entities fetched (minimize this): %s";
    private final static java.lang.String entityManagerFactoryAlreadyRegistered = "HHH000436: Entity manager factory name (%s) is already registered.  If entity manager will be clustered or passivated, specify a unique value for property '%s'";
    private final static java.lang.String unableToRollbackIsolatedTransaction = "HHH000364: Unable to rollback isolated transaction on error [%s] : [%s]";
    private final static java.lang.String addingOverrideFor = "HHH000418: Adding override for %s: %s";
    private final static java.lang.String unableToLocateConfigFile = "HHH000330: Unable to locate config file: %s";
    private final static java.lang.String runningSchemaValidator = "HHH000229: Running schema validator";
    private final static java.lang.String configurationResource = "HHH000040: Configuration resource: %s";
    private final static java.lang.String jdbcRollbackFailed = "HHH000151: JDBC rollback failed";
    private final static java.lang.String runningHbm2ddlSchemaExport = "HHH000227: Running hbm2ddl schema export";
    private final static java.lang.String jdbcAutoCommitFalseBreaksEjb3Spec = "HHH000144: %s = false breaks the EJB3 specification";
    private final static java.lang.String exceptionInBeforeTransactionCompletionInterceptor = "HHH000088: Exception in interceptor beforeTransactionCompletion()";
    private final static java.lang.String unableToLocateMBeanServer = "HHH000332: Unable to locate MBeanServer on JMX service shutdown";
    private final static java.lang.String failSafeEntitiesCleanup = "HHH000101: Fail-safe cleanup (entities) : %s";
    private final static java.lang.String unknownIngresVersion = "HHH000383: Unknown Ingres major version [%s]; using Ingres 9.2 dialect";
    private final static java.lang.String invalidArrayElementType = "HHH000132: Array element type error\n%s";
    private final static java.lang.String timestampCacheHits = "HHH000434: update timestamps cache hits: %s";
    private final static java.lang.String secondLevelCacheMisses = "HHH000238: Second level cache misses: %s";
    private final static java.lang.String noDefaultConstructor = "HHH000182: No default (no-argument) constructor for class: %s (class must be instantiated by Interceptor)";
    private final static java.lang.String batchContainedStatementsOnRelease = "HHH000010: On release of batch it still contained JDBC statements";
    private final static java.lang.String usingReflectionOptimizer = "HHH000406: Using bytecode reflection optimizer";
    private final static java.lang.String unableToDropTemporaryIdTable = "HHH000314: Unable to drop temporary id table after use [%s]";
    private final static java.lang.String configuringFromResource = "HHH000043: Configuring from resource: %s";
    private final static java.lang.String unableToCreateSchema = "HHH000306: Error creating schema ";
    private final static java.lang.String invalidTableAnnotation = "HHH000139: Illegal use of @Table in a subclass of a SINGLE_TABLE hierarchy: %s";
    private final static java.lang.String callingJoinTransactionOnNonJtaEntityManager = "HHH000027: Calling joinTransaction() on a non JTA EntityManager";
    private final static java.lang.String noColumnsSpecifiedForIndex = "HHH000432: There were not column names specified for index %s on table %s";
    private final static java.lang.String illegalPropertyGetterArgument = "HHH000122: IllegalArgumentException in class: %s, getter method of property: %s";
    private final static java.lang.String unableToBuildEnhancementMetamodel = "HHH000279: Unable to build enhancement metamodel for %s";
    private final static java.lang.String cacheProvider = "HHH000024: Cache provider: %s";
    private final static java.lang.String unableToLocateConfiguredSchemaNameResolver = "HHH000331: Unable to locate configured schema name resolver class [%s] %s";
    private final static java.lang.String firstOrMaxResultsSpecifiedWithCollectionFetch = "HHH000104: firstResult/maxResults specified with collection fetch; applying in memory!";
    private final static java.lang.String propertiesLoaded = "HHH000205: Loaded properties from resource hibernate.properties: %s";
    private final static java.lang.String deprecatedUuidGenerator = "HHH000065: DEPRECATED : use [%s] instead with custom [%s] implementation";
    private final static java.lang.String unableToCloseInputFiles = "HHH000286: Error closing input files: %s";
    private final static java.lang.String unableToToggleAutoCommit = "HHH000372: Could not toggle autocommit";
    private final static java.lang.String usingFollowOnLocking = "HHH000444: Encountered request for locking however dialect reports that database prefers locking be done in a separate select (follow-on locking); results will be locked after initial query executes";
    private final static java.lang.String unableToGetDatabaseMetadata = "HHH000319: Could not get database metadata";
    private final static java.lang.String invalidDiscriminatorAnnotation = "HHH000133: Discriminator column has to be defined in the root entity, it will be ignored in subclass: %s";
    private final static java.lang.String unableToUpdateQueryHiValue = "HHH000376: Could not updateQuery hi value in: %s";
    private final static java.lang.String unsupportedNamedParameters = "HHH000456: Named parameters are used for a callable statement, but database metadata indicates named parameters are not supported.";
    private final static java.lang.String processingPersistenceUnitInfoName = "HHH000204: Processing PersistenceUnitInfo [\n\tname: %s\n\t...]";
    private final static java.lang.String containsJoinFetchedCollection = "HHH000051: Ignoring bag join fetch [%s] due to prior collection join fetch";
    private final static java.lang.String unsupportedAfterStatement = "HHH000390: Overriding release mode as connection provider does not support 'after_statement'";
    private final static java.lang.String unableToReleaseIsolatedConnection = "HHH000356: Unable to release isolated connection [%s]";
    private final static java.lang.String compositeIdClassDoesNotOverrideHashCode = "HHH000039: Composite-id class does not override hashCode(): %s";
    private final static java.lang.String embedXmlAttributesNoLongerSupported = "HHH000446: embed-xml attributes were intended to be used for DOM4J entity mode. Since that entity mode has been removed, embed-xml attributes are no longer supported and should be removed from mappings.";
    private final static java.lang.String factoryUnboundFromJndiName = "HHH000097: Unbound factory from JNDI name: %s";
    private final static java.lang.String pooledOptimizerReportedInitialValue = "HHH000201: Pooled optimizer source reported [%s] as the initial value; use of 1 or greater highly recommended";
    private final static java.lang.String queryCacheHits = "HHH000213: Query cache hits: %s";
    private final static java.lang.String jdbcUrlNotSpecified = "HHH000152: JDBC URL was not specified by property %s";
    private final static java.lang.String unknownSqlServerVersion = "HHH000385: Unknown Microsoft SQL Server major version [%s] using SQL Server 2000 dialect";
    private final static java.lang.String unableToReadColumnValueFromResultSet = "HHH000349: Could not read column value from result set: %s; %s";
    private final static java.lang.String preparedStatementAlreadyInBatch = "HHH000202: PreparedStatement was already in the batch, [%s].";
    private final static java.lang.String unableToJoinTransaction = "HHH000326: Cannot join transaction: do not override %s";
    private final static java.lang.String containerProvidingNullPersistenceUnitRootUrl = "HHH000050: Container is providing a null PersistenceUnitRootUrl: discovery impossible";
    private final static java.lang.String gettersOfLazyClassesCannotBeFinal = "HHH000112: Getters of lazy classes cannot be final: %s.%s";
    private final static java.lang.String foundMappingDocument = "HHH000109: Found mapping document in jar: %s";
    private final static java.lang.String unableToInstantiateConfiguredSchemaNameResolver = "HHH000320: Unable to instantiate configured schema name resolver [%s] %s";
    private final static java.lang.String narrowingProxy = "HHH000179: Narrowing proxy to %s - this operation breaks ==";
    private final static java.lang.String runningHbm2ddlSchemaUpdate = "HHH000228: Running hbm2ddl schema update";
    private final static java.lang.String unableToBindValueToParameter = "HHH000278: Could not bind value '%s' to parameter: %s; %s";
    private final static java.lang.String collectionsLoaded = "HHH000033: Collections loaded: %s";
    private final static java.lang.String parsingXmlWarningForFile = "HHH000199: Warning parsing XML: %s(%s) %s";
    private final static java.lang.String queryCacheMisses = "HHH000214: Query cache misses: %s";
    private final static java.lang.String unableToLocateCustomOptimizerClass = "HHH000321: Unable to interpret specified optimizer [%s], falling back to noop";
    private final static java.lang.String loadingCollectionKeyNotFound = "HHH000159: In CollectionLoadContext#endLoadingCollections, localLoadingCollectionKeys contained [%s], but no LoadingCollectionEntry was found in loadContexts";
    private final static java.lang.String multipleValidationModes = "HHH000448: 'javax.persistence.validation.mode' named multiple values : %s";
    private final static java.lang.String unableToStopHibernateService = "HHH000368: Exception while stopping service";
    private final static java.lang.String autoFlushWillNotWork = "HHH000008: JTASessionContext being used with JDBCTransactionFactory; auto-flush will not operate correctly with getCurrentSession()";
    private final static java.lang.String usingUuidHexGenerator = "HHH000409: Using %s which does not generate IETF RFC 4122 compliant UUID values; consider using %s instead";
    private final static java.lang.String usingTimestampWorkaround = "HHH000408: Using workaround for JVM bug in java.sql.Timestamp";
    private final static java.lang.String unableToWrapResultSet = "HHH000377: Error wrapping result set";
    private final static java.lang.String tableFound = "HHH000261: Table found: %s";
    private final static java.lang.String disablingContextualLOBCreationSinceOldJdbcVersion = "HHH000423: Disabling contextual LOB creation as JDBC driver reported JDBC version [%s] less than 4";
    private final static java.lang.String unableToCleanUpPreparedStatement = "HHH000282: Unable to clean up prepared statement";
    private final static java.lang.String processEqualityExpression = "HHH000203: processEqualityExpression() : No expression to process!";
    private final static java.lang.String unableToReleaseTypeInfoResultSet = "HHH000357: Unable to release type info result set";
    private final static java.lang.String rdmsOs2200Dialect = "HHH000218: RDMSOS2200Dialect version: 1.0";
    private final static java.lang.String unableToReadOrInitHiValue = "HHH000351: Could not read or init a hi value";
    private final static java.lang.String queriesExecuted = "HHH000210: Queries executed to database: %s";
    private final static java.lang.String unableToAccessEjb3Configuration = "HHH000271: Naming exception occurred accessing Ejb3Configuration";
    private final static java.lang.String unableToDetermineTransactionStatus = "HHH000312: Could not determine transaction status";
    private final static java.lang.String sortAnnotationIndexedCollection = "HHH000244: @Sort not allowed for an indexed collection, annotation ignored.";
    private final static java.lang.String unexpectedLiteralTokenType = "HHH000380: Unexpected literal token type [%s] passed for numeric processing";
    private final static java.lang.String transactionStrategy = "HHH000268: Transaction strategy: %s";
    private final static java.lang.String sessionsOpened = "HHH000242: Sessions opened: %s";
    private final static java.lang.String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly = "HHH000200: Persistence provider caller does not implement the EJB3 spec correctly.PersistenceUnitInfo.getNewTempClassLoader() is null.";
    private final static java.lang.String unableToUpdateHiValue = "HHH000375: Could not update hi value in: %s";
    private final static java.lang.String unableToCloseSession = "HHH000294: Could not close session";
    private final static java.lang.String duplicateGeneratorTable = "HHH000070: Duplicate generator table: %s";
    private final static java.lang.String usingDriver = "HHH000401: using driver [%s] at URL [%s]";
    private final static java.lang.String readingMappingsFromResource = "HHH000221: Reading mappings from resource: %s";
    private final static java.lang.String unableToReadClass = "HHH000348: Unable to read class: %s";
    private final static java.lang.String incompleteMappingMetadataCacheProcessing = "HHH000125: Mapping metadata cache was not completely processed";
    private final static java.lang.String jndiInitialContextProperties = "HHH000154: JNDI InitialContext properties:%s";
    private final static java.lang.String alternateServiceRole = "HHH000450: Encountered request for Service by non-primary service role [%s -> %s]; please update usage";
    private final static java.lang.String ignoringUnrecognizedQueryHint = "HHH000121: Ignoring unrecognized query hint [%s]";
    private final static java.lang.String unableToInstantiateUuidGenerationStrategy = "HHH000325: Unable to instantiate UUID generation strategy class : %s";
    private final static java.lang.String entitiesLoaded = "HHH000079: Entities loaded: %s";
    private final static java.lang.String undeterminedH2Version = "HHH000431: Unable to determine H2 database version, certain features may not work";
    private final static java.lang.String deprecatedOracleDialect = "HHH000064: The OracleDialect dialect has been deprecated; use Oracle8iDialect instead";
    private final static java.lang.String sqlWarning = "HHH000247: SQL Error: %s, SQLState: %s";
    private final static java.lang.String unableToCloseInputStreamForResource = "HHH000288: Could not close input stream for %s";
    private final static java.lang.String unableToDestroyCache = "HHH000308: Unable to destroy cache: %s";
    private final static java.lang.String javassistEnhancementFailed = "HHH000142: Javassist Enhancement failed: %s";
    private final static java.lang.String unableToCloseSessionButSwallowingError = "HHH000425: Could not close session; swallowing exception[%s] as transaction completed";
    private final static java.lang.String closing = "HHH000031: Closing";
    private final static java.lang.String readingCachedMappings = "HHH000219: Reading mappings from cache file: %s";
    private final static java.lang.String expired = "HHH000092: An item was expired by the cache while it was locked (increase your cache timeout): %s";
    private final static java.lang.String duplicateListener = "HHH000073: entity-listener duplication, first event definition will be used: %s";
    private final static java.lang.String maxQueryTime = "HHH000173: Max query time: %sms";
    private final static java.lang.String successfulTransactions = "HHH000258: Successful transactions: %s";
    private final static java.lang.String unableToDetermineTransactionStatusAfterCommit = "HHH000313: Could not determine transaction status after commit";
    private final static java.lang.String unableToRollbackJta = "HHH000365: JTA rollback failed";
    private final static java.lang.String timestampCachePuts = "HHH000433: update timestamps cache puts: %s";
    private final static java.lang.String unableToRetrieveCache = "HHH000361: Unable to retreive cache from JNDI [%s]: %s";
    private final static java.lang.String configuringFromFile = "HHH000042: Configuring from file: %s";
    private final static java.lang.String jdbcIsolationLevel = "HHH000149: JDBC isolation level: %s";
    private final static java.lang.String naturalIdQueriesExecuted = "HHH000442: NaturalId queries executed to database: %s";
    private final static java.lang.String searchingForMappingDocuments = "HHH000235: Searching for mapping documents in jar: %s";
    private final static java.lang.String transactionStartedOnNonRootSession = "HHH000267: Transaction started on non-root session";
    private final static java.lang.String unableToParseMetadata = "HHH000344: Could not parse the package-level metadata [%s]";
    private final static java.lang.String unableToAccessTypeInfoResultSet = "HHH000273: Error accessing type info result set : %s";
    private final static java.lang.String unableToStopService = "HHH000369: Error stopping service [%s] : %s";
    private final static java.lang.String namedQueryError = "HHH000177: Error in named query: %s";
    private final static java.lang.String unsupportedOracleVersion = "HHH000394: Oracle 11g is not yet fully supported; using Oracle 10g dialect";
    private final static java.lang.String collectionsFetched = "HHH000032: Collections fetched (minimize this): %s";
    private final static java.lang.String naturalIdCachePuts = "HHH000438: NaturalId cache puts: %s";
    private final static java.lang.String queryCachePuts = "HHH000215: Query cache puts: %s";
    private final static java.lang.String applyingExplicitDiscriminatorColumnForJoined = "HHH000457: Joined inheritance hierarchy [%1$s] defined explicit @DiscriminatorColumn.  Legacy Hibernate behavior was to ignore the @DiscriminatorColumn.  However, as part of issue HHH-6911 we now apply the explicit @DiscriminatorColumn.  If you would prefer the legacy behavior, enable the `%2$s` setting (%2$s=true)";
    private final static java.lang.String rollbackFromBackgroundThread = "HHH000451: Transaction afterCompletion called by a background thread; delaying afterCompletion processing until the original thread can handle it. [status=%s]";
    private final static java.lang.String disablingContextualLOBCreation = "HHH000421: Disabling contextual LOB creation as %s is true";
    private final static java.lang.String c3p0ProviderClassNotFound = "HHH000022: c3p0 properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    private final static java.lang.String schemaExportUnsuccessful = "HHH000231: Schema export unsuccessful";
    private final static java.lang.String unableToObjectConnectionToQueryMetadata = "HHH000340: Could not obtain connection to query metadata: %s";
    private final static java.lang.String usingAstQueryTranslatorFactory = "HHH000397: Using ASTQueryTranslatorFactory";
    private final static java.lang.String unableToBindFactoryToJndi = "HHH000277: Could not bind factory to JNDI";
    private final static java.lang.String unableToSwitchToMethodUsingColumnIndex = "HHH000370: Exception switching from method: [%s] to a method using the column index. Reverting to using: [%<s]";
    private final static java.lang.String needsLimit = "HHH000180: FirstResult/maxResults specified on polymorphic query; applying in memory!";
    private final static java.lang.String fetchingDatabaseMetadata = "HHH000102: Fetching database metadata";
    private final static java.lang.String warningsCreatingTempTable = "HHH000413: Warnings creating temp table : %s";
    private final static java.lang.String immutableAnnotationOnNonRoot = "HHH000124: @Immutable used on a non root entity: ignored for %s";
    private final static java.lang.String statementsClosed = "HHH000252: Statements closed: %s";
    private final static java.lang.String explicitSkipLockedLockCombo = "HHH000447: Explicit use of UPGRADE_SKIPLOCKED in lock() calls is not recommended; use normal UPGRADE locking instead";
    private final static java.lang.String unableToPerformManagedFlush = "HHH000346: Error during managed flush [%s]";
    private final static java.lang.String forcingContainerResourceCleanup = "HHH000106: Forcing container resource cleanup on transaction completion";
    private final static java.lang.String jdbcDriverNotSpecified = "HHH000148: No JDBC Driver class was specified by property %s";
    private final static java.lang.String unableToDestroyUpdateTimestampsCache = "HHH000310: Unable to destroy update timestamps cache: %s: %s";
    private final static java.lang.String willNotRegisterListeners = "HHH000414: Property hibernate.search.autoregister_listeners is set to false. No attempt will be made to register Hibernate Search event listeners.";
    private final static java.lang.String exceptionInAfterTransactionCompletionInterceptor = "HHH000087: Exception in interceptor afterTransactionCompletion()";
    private final static java.lang.String unableToLoadProperties = "HHH000329: Problem loading properties from hibernate.properties";
    private final static java.lang.String unableToBuildSessionFactoryUsingMBeanClasspath = "HHH000280: Could not build SessionFactory using the MBean classpath - will try again using client classpath: %s";
    private final static java.lang.String sessionsClosed = "HHH000241: Sessions closed: %s";
    private final static java.lang.String unknownOracleVersion = "HHH000384: Unknown Oracle major version [%s]";
    private final static java.lang.String unableToCommitJta = "HHH000298: JTA commit failed";
    private final static java.lang.String unableToSynchronizeDatabaseStateWithSession = "HHH000371: Could not synchronize database state with session: %s";
    private final static java.lang.String unableToExecuteBatch = "HHH000315: Exception executing batch [%s]";
    private final static java.lang.String deprecatedDerbyDialect = "HHH000430: The DerbyDialect dialect has been deprecated; use one of the version-specific dialects instead";
    private final static java.lang.String unableToCopySystemProperties = "HHH000304: Could not copy system properties, system properties will be ignored";
    private final static java.lang.String localLoadingCollectionKeysCount = "HHH000160: On CollectionLoadContext#cleanup, localLoadingCollectionKeys contained [%s] entries";
    private final static java.lang.String unableToSetTransactionToRollbackOnly = "HHH000367: Could not set transaction to rollback only";
    private final static java.lang.String invalidEditOfReadOnlyItem = "HHH000134: Application attempted to edit read only item: %s";
    private final static java.lang.String nonCompliantMapConversion = "HHH000449: @Convert annotation applied to Map attribute [%s] did not explicitly specify attributeName using 'key'/'value' as required by spec; attempting to DoTheRightThing";
    private final static java.lang.String validatorNotFound = "HHH000410: Hibernate Validator not found: ignoring";
    private final static java.lang.String typeRegistrationOverridesPrevious = "HHH000270: Type registration [%s] overrides previous : %s";
    private final static java.lang.String jaccContextId = "HHH000140: JACC contextID: %s";
    private final static java.lang.String unableToBindEjb3ConfigurationToJndi = "HHH000276: Could not bind Ejb3Configuration to JNDI";
    private final static java.lang.String cachedFileNotFound = "HHH000023: I/O reported cached file could not be found : %s : %s";
    private final static java.lang.String exceptionHeaderNotFound = "HHH000086: %s No %s found";
    private final static java.lang.String synchronizationFailed = "HHH000260: Exception calling user Synchronization [%s] : %s";
    private final static java.lang.String disablingContextualLOBCreationSinceCreateClobFailed = "HHH000424: Disabling contextual LOB creation as createClob() method threw error : %s";
    private final static java.lang.String unableToRemoveBagJoinFetch = "HHH000358: Unable to erase previously added bag join fetch";
    private final static java.lang.String unableToExecuteResolver = "HHH000316: Error executing resolver [%s] : %s";
    private final static java.lang.String statementsPrepared = "HHH000253: Statements prepared: %s";
    private final static java.lang.String unableToAccessSessionFactory = "HHH000272: Error while accessing session factory with JNDI name %s";
    private final static java.lang.String invalidPrimaryKeyJoinColumnAnnotation = "HHH000137: Root entity should not hold an PrimaryKeyJoinColum(s), will be ignored";
    private final static java.lang.String handlingTransientEntity = "HHH000114: Handling transient entity in delete processing";
    private final static java.lang.String unableToObtainInitialContext = "HHH000343: Could not obtain initial context";
    private final static java.lang.String failed = "HHH000099: an assertion failure occured (this may indicate a bug in Hibernate, but is more likely due to unsafe use of the session): %s";
    private final static java.lang.String ignoringTableGeneratorConstraints = "HHH000120: Ignoring unique constraints specified on table generator [%s]";
    private final static java.lang.String unableToCloseIterator = "HHH000289: Unable to close iterator";
    private final static java.lang.String unableToCloseInputStream = "HHH000287: Could not close input stream";
    private final static java.lang.String namingExceptionAccessingFactory = "HHH000178: Naming exception occurred accessing factory: %s";
    private final static java.lang.String unsuccessfulCreate = "HHH000389: Unsuccessful: %s";
    private final static java.lang.String unableToConfigureSqlExceptionConverter = "HHH000301: Unable to configure SQLExceptionConverter : %s";
    private final static java.lang.String unableToApplyConstraints = "HHH000274: Unable to apply constraints on DDL for %s";
    private final static java.lang.String unableToTransformClass = "HHH000373: Unable to transform class: %s";
    private final static java.lang.String unableToResolveMappingFile = "HHH000360: Unable to resolve mapping file [%s]";
    private final static java.lang.String missingEntityAnnotation = "HHH000175: Class annotated @org.hibernate.annotations.Entity but not javax.persistence.Entity (most likely a user error): %s";
    private final static java.lang.String startingQueryCache = "HHH000248: Starting query cache at region: %s";
    private final static java.lang.String unableToCloseSessionDuringRollback = "HHH000295: Could not close session during rollback";
    private final static java.lang.String cleaningUpConnectionPool = "HHH000030: Cleaning up connection pool [%s]";
    private final static java.lang.String unableToUnbindFactoryFromJndi = "HHH000374: Could not unbind factory from JNDI";
    private final static java.lang.String unableToCloseStream = "HHH000296: IOException occurred closing stream";
    private final static java.lang.String missingArguments = "HHH000174: Function template anticipated %s arguments, but %s arguments encountered";
    private final static java.lang.String scopingTypesToSessionFactoryAfterAlreadyScoped = "HHH000233: Scoping types to session factory %s after already scoped %s";
    private final static java.lang.String unableToFindPersistenceXmlInClasspath = "HHH000318: Could not find any META-INF/persistence.xml file in the classpath";
    private final static java.lang.String unableToCleanupTemporaryIdTable = "HHH000283: Unable to cleanup temporary id table after use [%s]";
    private final static java.lang.String invalidJndiName = "HHH000135: Invalid JNDI name: %s";
    private final static java.lang.String entityIdentifierValueBindingExists = "HHH000429: Setting entity-identifier value binding where one already existed : %s.";
    private final static java.lang.String noSessionFactoryWithJndiName = "HHH000184: No session factory with JNDI name %s";
    private final static java.lang.String propertiesNotFound = "HHH000206: hibernate.properties not found";
    private final static java.lang.String lazyPropertyFetchingAvailable = "HHH000157: Lazy property fetching available for: %s";
    private final static java.lang.String synchronizationAlreadyRegistered = "HHH000259: Synchronization [%s] was already registered";
    private final static java.lang.String usingDefaultIdGeneratorSegmentValue = "HHH000398: Explicit segment value for id generator [%s.%s] suggested; using default [%s]";
    private final static java.lang.String configuringFromXmlDocument = "HHH000045: Configuring from XML document";
    private final static java.lang.String configuredSessionFactory = "HHH000041: Configured SessionFactory: %s";
    private final static java.lang.String indexes = "HHH000126: Indexes: %s";
    private final static java.lang.String configuringFromUrl = "HHH000044: Configuring from URL: %s";
    private final static java.lang.String usingOldDtd = "HHH000404: Don't use old DTDs, read the Hibernate 3.x Migration Guide!";
    private final static java.lang.String unableToReleaseCacheLock = "HHH000353: Could not release a cache lock : %s";
    private final static java.lang.String updatingSchema = "HHH000396: Updating schema";
    private final static java.lang.String unsupportedIngresVersion = "HHH000391: Ingres 10 is not yet fully supported; using Ingres 9.3 dialect";
    private final static java.lang.String naturalIdCacheMisses = "HHH000440: NaturalId cache misses: %s";
    private final static java.lang.String factoryJndiRename = "HHH000096: A factory was renamed from [%s] to [%s] in JNDI";
    private final static java.lang.String unableToConstructSqlExceptionConverter = "HHH000303: Unable to construct instance of specified SQLExceptionConverter : %s";
    private final static java.lang.String subResolverException = "HHH000257: sub-resolver threw unexpected exception, continuing to next : %s";
    private final static java.lang.String unableToObjectConnectionMetadata = "HHH000339: Could not obtain connection metadata: %s";
    private final static java.lang.String renamedProperty = "HHH000225: Property [%s] has been renamed to [%s]; update your properties appropriately";
    private final static java.lang.String expectedType = "HHH000091: Expected type: %s, actual value: %s";
    private final static java.lang.String unableToLogSqlWarnings = "HHH000335: Unable to log SQLWarnings : %s";
    private final static java.lang.String resolvedSqlTypeDescriptorForDifferentSqlCode = "HHH000419: Resolved SqlTypeDescriptor is for a different SQL code. %s has sqlCode=%s; type override %s has sqlCode=%s";
    private final static java.lang.String usingDefaultTransactionStrategy = "HHH000399: Using default transaction strategy (direct JDBC transactions)";
    private final static java.lang.String splitQueries = "HHH000245: Manipulation query [%s] resulted in [%s] split queries";
    private final static java.lang.String invalidOnDeleteAnnotation = "HHH000136: Inapropriate use of @OnDelete on entity, annotation ignored: %s";
    private final static java.lang.String typeDefinedNoRegistrationKeys = "HHH000269: Type [%s] defined no registration keys; ignoring";
    private final static java.lang.String usingHibernateBuiltInConnectionPool = "HHH000402: Using Hibernate built-in connection pool (not for production use!)";
    private final static java.lang.String instantiatingExplicitConnectionProvider = "HHH000130: Instantiating explicit connection provider: %s";
    private final static java.lang.String tableNotFound = "HHH000262: Table not found: %s";
    private final static java.lang.String collectionsUpdated = "HHH000036: Collections updated: %s";
    private final static java.lang.String unableToCloseInitialContext = "HHH000285: Error closing InitialContext [%s]";
    private final static java.lang.String unableToCloseJar = "HHH000290: Could not close jar: %s";
    private final static java.lang.String propertyNotFound = "HHH000207: Property %s not found in class but described in <mapping-file/> (possible typo error)";
    private final static java.lang.String closingUnreleasedBatch = "HHH000420: Closing un-released batch";
    private final static java.lang.String optimisticLockFailures = "HHH000187: Optimistic lock failures: %s";
    private final static java.lang.String failSafeCollectionsCleanup = "HHH000100: Fail-safe cleanup (collections) : %s";
    private final static java.lang.String transactions = "HHH000266: Transactions: %s";
    private final static java.lang.String duplicateImport = "HHH000071: Duplicate import: %s -> %s";
    private final static java.lang.String couldNotBindJndiListener = "HHH000127: Could not bind JNDI listener";
    private final static java.lang.String hydratingEntitiesCount = "HHH000119: On EntityLoadContext#clear, hydratingEntities contained [%s] entries";
    private final static java.lang.String timestampCacheMisses = "HHH000435: update timestamps cache misses: %s";
    private final static java.lang.String unableToObtainConnectionToQueryMetadata = "HHH000342: Could not obtain connection to query metadata : %s";
    private final static java.lang.String collectionsRemoved = "HHH000035: Collections removed: %s";
    private final static java.lang.String exceptionHeaderFound = "HHH000085: %s %s found";

    public CoreMessageLogger_$logger(final Logger log) {
        super(log);
    }

    public final void entityAnnotationOnNonRoot(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, entityAnnotationOnNonRoot$str(), className);
    }

    protected java.lang.String entityAnnotationOnNonRoot$str() {
        return entityAnnotationOnNonRoot;
    }

    public final void unableToLogWarnings(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToLogWarnings$str());
    }

    protected java.lang.String unableToLogWarnings$str() {
        return unableToLogWarnings;
    }

    public final void writingGeneratedSchemaToFile(final java.lang.String outputFile) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, writingGeneratedSchemaToFile$str(), outputFile);
    }

    protected java.lang.String writingGeneratedSchemaToFile$str() {
        return writingGeneratedSchemaToFile;
    }

    public final void secondLevelCachePuts(final long secondLevelCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, secondLevelCachePuts$str(), secondLevelCachePutCount);
    }

    protected java.lang.String secondLevelCachePuts$str() {
        return secondLevelCachePuts;
    }

    public final void creatingSubcontextInfo(final java.lang.String intermediateContextName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, creatingSubcontextInfo$str(), intermediateContextName);
    }

    protected java.lang.String creatingSubcontextInfo$str() {
        return creatingSubcontextInfo;
    }

    public final void logicalConnectionReleasingPhysicalConnection() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, logicalConnectionReleasingPhysicalConnection$str());
    }

    protected java.lang.String logicalConnectionReleasingPhysicalConnection$str() {
        return logicalConnectionReleasingPhysicalConnection;
    }

    public final void guidGenerated(final java.lang.String result) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, guidGenerated$str(), result);
    }

    protected java.lang.String guidGenerated$str() {
        return guidGenerated;
    }

    public final void logicalConnectionClosed() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, logicalConnectionClosed$str());
    }

    protected java.lang.String logicalConnectionClosed$str() {
        return logicalConnectionClosed;
    }

    public final void overridingTransactionStrategyDangerous(final java.lang.String transactionStrategy) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, overridingTransactionStrategyDangerous$str(), transactionStrategy);
    }

    protected java.lang.String overridingTransactionStrategyDangerous$str() {
        return overridingTransactionStrategyDangerous;
    }

    public final void startingServiceAtJndiName(final java.lang.String boundName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, startingServiceAtJndiName$str(), boundName);
    }

    protected java.lang.String startingServiceAtJndiName$str() {
        return startingServiceAtJndiName;
    }

    public final void entitiesInserted(final long entityInsertCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, entitiesInserted$str(), entityInsertCount);
    }

    protected java.lang.String entitiesInserted$str() {
        return entitiesInserted;
    }

    public final void entitiesUpdated(final long entityUpdateCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, entitiesUpdated$str(), entityUpdateCount);
    }

    protected java.lang.String entitiesUpdated$str() {
        return entitiesUpdated;
    }

    public final void legacyTransactionManagerStrategy(final java.lang.String name, final java.lang.String jtaPlatform) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, legacyTransactionManagerStrategy$str(), name, jtaPlatform);
    }

    protected java.lang.String legacyTransactionManagerStrategy$str() {
        return legacyTransactionManagerStrategy;
    }

    public final void unregisteredStatement() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, unregisteredStatement$str());
    }

    protected java.lang.String unregisteredStatement$str() {
        return unregisteredStatement;
    }

    public final void tooManyInExpressions(final java.lang.String dialectName, final int limit, final java.lang.String paramName, final int size) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, tooManyInExpressions$str(), dialectName, limit, paramName, size);
    }

    protected java.lang.String tooManyInExpressions$str() {
        return tooManyInExpressions;
    }

    public final void version(final java.lang.String versionString) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, version$str(), versionString);
    }

    protected java.lang.String version$str() {
        return version;
    }

    public final void factoryBoundToJndiName(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, factoryBoundToJndiName$str(), name);
    }

    protected java.lang.String factoryBoundToJndiName$str() {
        return factoryBoundToJndiName;
    }

    public final void unknownBytecodeProvider(final java.lang.String providerName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unknownBytecodeProvider$str(), providerName);
    }

    protected java.lang.String unknownBytecodeProvider$str() {
        return unknownBytecodeProvider;
    }

    public final void secondLevelCacheHits(final long secondLevelCacheHitCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, secondLevelCacheHits$str(), secondLevelCacheHitCount);
    }

    protected java.lang.String secondLevelCacheHits$str() {
        return secondLevelCacheHits;
    }

    public final void illegalPropertySetterArgument(final java.lang.String name, final java.lang.String propertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, illegalPropertySetterArgument$str(), name, propertyName);
    }

    protected java.lang.String illegalPropertySetterArgument$str() {
        return illegalPropertySetterArgument;
    }

    public final void unableToDestroyQueryCache(final java.lang.String region, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToDestroyQueryCache$str(), region, message);
    }

    protected java.lang.String unableToDestroyQueryCache$str() {
        return unableToDestroyQueryCache;
    }

    public final void unsupportedProperty(final java.lang.Object propertyName, final java.lang.Object newPropertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedProperty$str(), propertyName, newPropertyName);
    }

    protected java.lang.String unsupportedProperty$str() {
        return unsupportedProperty;
    }

    public final void requiredDifferentProvider(final java.lang.String provider) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, requiredDifferentProvider$str(), provider);
    }

    protected java.lang.String requiredDifferentProvider$str() {
        return requiredDifferentProvider;
    }

    public final void unableToCreateProxyFactory(final java.lang.String entityName, final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCreateProxyFactory$str(), entityName);
    }

    protected java.lang.String unableToCreateProxyFactory$str() {
        return unableToCreateProxyFactory;
    }

    public final void deprecatedOracle9Dialect() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedOracle9Dialect$str());
    }

    protected java.lang.String deprecatedOracle9Dialect$str() {
        return deprecatedOracle9Dialect;
    }

    public final void unableToObtainConnectionMetadata(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToObtainConnectionMetadata$str(), message);
    }

    protected java.lang.String unableToObtainConnectionMetadata$str() {
        return unableToObtainConnectionMetadata;
    }

    public final void unableToClosePooledConnection(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToClosePooledConnection$str());
    }

    protected java.lang.String unableToClosePooledConnection$str() {
        return unableToClosePooledConnection;
    }

    public final void disablingContextualLOBCreationSinceConnectionNull() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, disablingContextualLOBCreationSinceConnectionNull$str());
    }

    protected java.lang.String disablingContextualLOBCreationSinceConnectionNull$str() {
        return disablingContextualLOBCreationSinceConnectionNull;
    }

    public final void schemaUpdateComplete() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, schemaUpdateComplete$str());
    }

    protected java.lang.String schemaUpdateComplete$str() {
        return schemaUpdateComplete;
    }

    public final void naturalIdCacheHits(final long naturalIdCacheHitCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, naturalIdCacheHits$str(), naturalIdCacheHitCount);
    }

    protected java.lang.String naturalIdCacheHits$str() {
        return naturalIdCacheHits;
    }

    public final void usingStreams() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingStreams$str());
    }

    protected java.lang.String usingStreams$str() {
        return usingStreams;
    }

    public final void alreadySessionBound() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, alreadySessionBound$str());
    }

    protected java.lang.String alreadySessionBound$str() {
        return alreadySessionBound;
    }

    public final void disallowingInsertStatementComment() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, disallowingInsertStatementComment$str());
    }

    protected java.lang.String disallowingInsertStatementComment$str() {
        return disallowingInsertStatementComment;
    }

    public final void unableToCloseOutputFile(final java.lang.String outputFile, final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCloseOutputFile$str(), outputFile);
    }

    protected java.lang.String unableToCloseOutputFile$str() {
        return unableToCloseOutputFile;
    }

    public final void loggingStatistics() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, loggingStatistics$str());
    }

    protected java.lang.String loggingStatistics$str() {
        return loggingStatistics;
    }

    public final void unableToCompleteSchemaUpdate(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCompleteSchemaUpdate$str());
    }

    protected java.lang.String unableToCompleteSchemaUpdate$str() {
        return unableToCompleteSchemaUpdate;
    }

    public final void unableToLoadCommand(final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToLoadCommand$str(), e);
    }

    protected java.lang.String unableToLoadCommand$str() {
        return unableToLoadCommand;
    }

    public final void unableToDetermineLockModeValue(final java.lang.String hintName, final java.lang.Object value) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToDetermineLockModeValue$str(), hintName, value);
    }

    protected java.lang.String unableToDetermineLockModeValue$str() {
        return unableToDetermineLockModeValue;
    }

    public final void aliasSpecificLockingWithFollowOnLocking(final LockMode lockMode) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, aliasSpecificLockingWithFollowOnLocking$str(), lockMode);
    }

    protected java.lang.String aliasSpecificLockingWithFollowOnLocking$str() {
        return aliasSpecificLockingWithFollowOnLocking;
    }

    public final void definingFlushBeforeCompletionIgnoredInHem(final java.lang.String flushBeforeCompletion) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, definingFlushBeforeCompletionIgnoredInHem$str(), flushBeforeCompletion);
    }

    protected java.lang.String definingFlushBeforeCompletionIgnoredInHem$str() {
        return definingFlushBeforeCompletionIgnoredInHem;
    }

    public final void duplicateMetadata() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, duplicateMetadata$str());
    }

    protected java.lang.String duplicateMetadata$str() {
        return duplicateMetadata;
    }

    public final void orderByAnnotationIndexedCollection() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, orderByAnnotationIndexedCollection$str());
    }

    protected java.lang.String orderByAnnotationIndexedCollection$str() {
        return orderByAnnotationIndexedCollection;
    }

    public final void packageNotFound(final java.lang.String packageName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, packageNotFound$str(), packageName);
    }

    protected java.lang.String packageNotFound$str() {
        return packageNotFound;
    }

    public final void unableToRunSchemaUpdate(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToRunSchemaUpdate$str());
    }

    protected java.lang.String unableToRunSchemaUpdate$str() {
        return unableToRunSchemaUpdate;
    }

    public final void compositeIdClassDoesNotOverrideEquals(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, compositeIdClassDoesNotOverrideEquals$str(), name);
    }

    protected java.lang.String compositeIdClassDoesNotOverrideEquals$str() {
        return compositeIdClassDoesNotOverrideEquals;
    }

    public final void schemaExportComplete() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, schemaExportComplete$str());
    }

    protected java.lang.String schemaExportComplete$str() {
        return schemaExportComplete;
    }

    public final void unableToMarkForRollbackOnTransientObjectException(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToMarkForRollbackOnTransientObjectException$str());
    }

    protected java.lang.String unableToMarkForRollbackOnTransientObjectException$str() {
        return unableToMarkForRollbackOnTransientObjectException;
    }

    public final void serviceProperties(final java.util.Properties properties) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, serviceProperties$str(), properties);
    }

    protected java.lang.String serviceProperties$str() {
        return serviceProperties;
    }

    public final void unableToLocateUuidGenerationStrategy(final java.lang.String strategyClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLocateUuidGenerationStrategy$str(), strategyClassName);
    }

    protected java.lang.String unableToLocateUuidGenerationStrategy$str() {
        return unableToLocateUuidGenerationStrategy;
    }

    public final void naturalIdMaxQueryTime(final long naturalIdQueryExecutionMaxTime) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, naturalIdMaxQueryTime$str(), naturalIdQueryExecutionMaxTime);
    }

    protected java.lang.String naturalIdMaxQueryTime$str() {
        return naturalIdMaxQueryTime;
    }

    public final void entitiesDeleted(final long entityDeleteCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, entitiesDeleted$str(), entityDeleteCount);
    }

    protected java.lang.String entitiesDeleted$str() {
        return entitiesDeleted;
    }

    public final void deprecatedManyToManyOuterJoin() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedManyToManyOuterJoin$str());
    }

    protected java.lang.String deprecatedManyToManyOuterJoin$str() {
        return deprecatedManyToManyOuterJoin;
    }

    public final void unableToDeserializeCache(final java.lang.String path, final SerializationException error) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToDeserializeCache$str(), path, error);
    }

    protected java.lang.String unableToDeserializeCache$str() {
        return unableToDeserializeCache;
    }

    public final void unableToLoadScannedClassOrResource(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToLoadScannedClassOrResource$str());
    }

    protected java.lang.String unableToLoadScannedClassOrResource$str() {
        return unableToLoadScannedClassOrResource;
    }

    public final void invalidSubStrategy(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidSubStrategy$str(), className);
    }

    protected java.lang.String invalidSubStrategy$str() {
        return invalidSubStrategy;
    }

    public final void entityMappedAsNonAbstract(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, entityMappedAsNonAbstract$str(), name);
    }

    protected java.lang.String entityMappedAsNonAbstract$str() {
        return entityMappedAsNonAbstract;
    }

    public final void unableToReleaseContext(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToReleaseContext$str(), message);
    }

    protected java.lang.String unableToReleaseContext$str() {
        return unableToReleaseContext;
    }

    public final void unableToInstantiateOptimizer(final java.lang.String type) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToInstantiateOptimizer$str(), type);
    }

    protected java.lang.String unableToInstantiateOptimizer$str() {
        return unableToInstantiateOptimizer;
    }

    public final void connectionProperties(final java.util.Properties connectionProps) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, connectionProperties$str(), connectionProps);
    }

    protected java.lang.String connectionProperties$str() {
        return connectionProperties;
    }

    public final void collectionsRecreated(final long collectionRecreateCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, collectionsRecreated$str(), collectionRecreateCount);
    }

    protected java.lang.String collectionsRecreated$str() {
        return collectionsRecreated;
    }

    public final java.lang.String unableToPerformJdbcCommit() {
        java.lang.String result = java.lang.String.format(unableToPerformJdbcCommit$str());
        return result;
    }

    protected java.lang.String unableToPerformJdbcCommit$str() {
        return unableToPerformJdbcCommit;
    }

    public final void unableToCompleteSchemaValidation(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCompleteSchemaValidation$str());
    }

    protected java.lang.String unableToCompleteSchemaValidation$str() {
        return unableToCompleteSchemaValidation;
    }

    public final void bytecodeProvider(final java.lang.String provider) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, bytecodeProvider$str(), provider);
    }

    protected java.lang.String bytecodeProvider$str() {
        return bytecodeProvider;
    }

    public final void unsupportedMultiTableBulkHqlJpaql(final int majorVersion, final int minorVersion, final int buildId) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedMultiTableBulkHqlJpaql$str(), majorVersion, minorVersion, buildId);
    }

    protected java.lang.String unsupportedMultiTableBulkHqlJpaql$str() {
        return unsupportedMultiTableBulkHqlJpaql;
    }

    public final void flushes(final long flushCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, flushes$str(), flushCount);
    }

    protected java.lang.String flushes$str() {
        return flushes;
    }

    public final void unableToDiscoverOsgiService(final java.lang.String service, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToDiscoverOsgiService$str(), service);
    }

    protected java.lang.String unableToDiscoverOsgiService$str() {
        return unableToDiscoverOsgiService;
    }

    public final void honoringOptimizerSetting(final java.lang.String none, final java.lang.String incrementParam, final int incrementSize) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, honoringOptimizerSetting$str(), none, incrementParam, incrementSize);
    }

    protected java.lang.String honoringOptimizerSetting$str() {
        return honoringOptimizerSetting;
    }

    public final void unableToCleanUpCallableStatement(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCleanUpCallableStatement$str());
    }

    protected java.lang.String unableToCleanUpCallableStatement$str() {
        return unableToCleanUpCallableStatement;
    }

    public final void parsingXmlWarning(final int lineNumber, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, parsingXmlWarning$str(), lineNumber, message);
    }

    protected java.lang.String parsingXmlWarning$str() {
        return parsingXmlWarning;
    }

    public final void startTime(final long startTime) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, startTime$str(), startTime);
    }

    protected java.lang.String startTime$str() {
        return startTime;
    }

    public final void writeLocksNotSupported(final java.lang.String entityName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, writeLocksNotSupported$str(), entityName);
    }

    protected java.lang.String writeLocksNotSupported$str() {
        return writeLocksNotSupported;
    }

    public final void hibernateConnectionPoolSize(final int poolSize, final int minSize) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, hibernateConnectionPoolSize$str(), poolSize, minSize);
    }

    protected java.lang.String hibernateConnectionPoolSize$str() {
        return hibernateConnectionPoolSize;
    }

    public final void providerClassDeprecated(final java.lang.String providerClassName, final java.lang.String actualProviderClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, providerClassDeprecated$str(), providerClassName, actualProviderClassName);
    }

    protected java.lang.String providerClassDeprecated$str() {
        return providerClassDeprecated;
    }

    public final void proxoolProviderClassNotFound(final java.lang.String proxoolProviderClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, proxoolProviderClassNotFound$str(), proxoolProviderClassName);
    }

    protected java.lang.String proxoolProviderClassNotFound$str() {
        return proxoolProviderClassNotFound;
    }

    public final void unregisteredResultSetWithoutStatement() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unregisteredResultSetWithoutStatement$str());
    }

    protected java.lang.String unregisteredResultSetWithoutStatement$str() {
        return unregisteredResultSetWithoutStatement;
    }

    public final void factoryUnboundFromName(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, factoryUnboundFromName$str(), name);
    }

    protected java.lang.String factoryUnboundFromName$str() {
        return factoryUnboundFromName;
    }

    public final void noPersistentClassesFound(final java.lang.String query) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, noPersistentClassesFound$str(), query);
    }

    protected java.lang.String noPersistentClassesFound$str() {
        return noPersistentClassesFound;
    }

    public final void settersOfLazyClassesCannotBeFinal(final java.lang.String entityName, final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, settersOfLazyClassesCannotBeFinal$str(), entityName, name);
    }

    protected java.lang.String settersOfLazyClassesCannotBeFinal$str() {
        return settersOfLazyClassesCannotBeFinal;
    }

    public final void unableToResolveAggregateFunction(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToResolveAggregateFunction$str(), name);
    }

    protected java.lang.String unableToResolveAggregateFunction$str() {
        return unableToResolveAggregateFunction;
    }

    public final void hql(final java.lang.String hql, final java.lang.Long valueOf, final java.lang.Long valueOf2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, hql$str(), hql, valueOf, valueOf2);
    }

    protected java.lang.String hql$str() {
        return hql;
    }

    public final void foreignKeys(final java.util.Set keySet) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, foreignKeys$str(), keySet);
    }

    protected java.lang.String foreignKeys$str() {
        return foreignKeys;
    }

    public final void forcingTableUse() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, forcingTableUse$str());
    }

    protected java.lang.String forcingTableUse$str() {
        return forcingTableUse;
    }

    public final void readOnlyCacheConfiguredForMutableCollection(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, readOnlyCacheConfiguredForMutableCollection$str(), name);
    }

    protected java.lang.String readOnlyCacheConfiguredForMutableCollection$str() {
        return readOnlyCacheConfiguredForMutableCollection;
    }

    public final void columns(final java.util.Set keySet) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, columns$str(), keySet);
    }

    protected java.lang.String columns$str() {
        return columns;
    }

    public final void unsuccessful(final java.lang.String sql) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unsuccessful$str(), sql);
    }

    protected java.lang.String unsuccessful$str() {
        return unsuccessful;
    }

    public final void duplicateGeneratorName(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, duplicateGeneratorName$str(), name);
    }

    protected java.lang.String duplicateGeneratorName$str() {
        return duplicateGeneratorName;
    }

    public final void unsupportedInitialValue(final java.lang.String propertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedInitialValue$str(), propertyName);
    }

    protected java.lang.String unsupportedInitialValue$str() {
        return unsupportedInitialValue;
    }

    public final void unableToReleaseBatchStatement() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToReleaseBatchStatement$str());
    }

    protected java.lang.String unableToReleaseBatchStatement$str() {
        return unableToReleaseBatchStatement;
    }

    public final java.lang.String unableToReadHiValue(final java.lang.String tableName) {
        java.lang.String result = java.lang.String.format(unableToReadHiValue$str(), tableName);
        return result;
    }

    protected java.lang.String unableToReadHiValue$str() {
        return unableToReadHiValue;
    }

    public final void duplicateJoins(final java.lang.String entityName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, duplicateJoins$str(), entityName);
    }

    protected java.lang.String duplicateJoins$str() {
        return duplicateJoins;
    }

    public final void startingUpdateTimestampsCache(final java.lang.String region) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, startingUpdateTimestampsCache$str(), region);
    }

    protected java.lang.String startingUpdateTimestampsCache$str() {
        return startingUpdateTimestampsCache;
    }

    public final void unexpectedRowCounts() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unexpectedRowCounts$str());
    }

    protected java.lang.String unexpectedRowCounts$str() {
        return unexpectedRowCounts;
    }

    public final void unableToRollbackConnection(final java.lang.Exception ignore) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToRollbackConnection$str(), ignore);
    }

    protected java.lang.String unableToRollbackConnection$str() {
        return unableToRollbackConnection;
    }

    public final void stoppingService() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, stoppingService$str());
    }

    protected java.lang.String stoppingService$str() {
        return stoppingService;
    }

    public final void unableToLoadDerbyDriver(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLoadDerbyDriver$str(), message);
    }

    protected java.lang.String unableToLoadDerbyDriver$str() {
        return unableToLoadDerbyDriver;
    }

    public final void jndiNameDoesNotHandleSessionFactoryReference(final java.lang.String sfJNDIName, final ClassCastException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), jndiNameDoesNotHandleSessionFactoryReference$str(), sfJNDIName);
    }

    protected java.lang.String jndiNameDoesNotHandleSessionFactoryReference$str() {
        return jndiNameDoesNotHandleSessionFactoryReference;
    }

    public final void unableToRetrieveTypeInfoResultSet(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToRetrieveTypeInfoResultSet$str(), string);
    }

    protected java.lang.String unableToRetrieveTypeInfoResultSet$str() {
        return unableToRetrieveTypeInfoResultSet;
    }

    public final void autoCommitMode(final boolean autocommit) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, autoCommitMode$str(), autocommit);
    }

    protected java.lang.String autoCommitMode$str() {
        return autoCommitMode;
    }

    public final void deprecatedForceDescriminatorAnnotation() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedForceDescriminatorAnnotation$str());
    }

    protected java.lang.String deprecatedForceDescriminatorAnnotation$str() {
        return deprecatedForceDescriminatorAnnotation;
    }

    public final void parsingXmlError(final int lineNumber, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, parsingXmlError$str(), lineNumber, message);
    }

    protected java.lang.String parsingXmlError$str() {
        return parsingXmlError;
    }

    public final void unableToMarkForRollbackOnPersistenceException(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToMarkForRollbackOnPersistenceException$str());
    }

    protected java.lang.String unableToMarkForRollbackOnPersistenceException$str() {
        return unableToMarkForRollbackOnPersistenceException;
    }

    public final void unableToCloseStreamError(final java.io.IOException error) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToCloseStreamError$str(), error);
    }

    protected java.lang.String unableToCloseStreamError$str() {
        return unableToCloseStreamError;
    }

    public final void unableToConstructCurrentSessionContext(final java.lang.String impl, final java.lang.Throwable e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToConstructCurrentSessionContext$str(), impl);
    }

    protected java.lang.String unableToConstructCurrentSessionContext$str() {
        return unableToConstructCurrentSessionContext;
    }

    public final void setManagerLookupClass() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, setManagerLookupClass$str());
    }

    protected java.lang.String setManagerLookupClass$str() {
        return setManagerLookupClass;
    }

    public final void exceptionInSubResolver(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, exceptionInSubResolver$str(), message);
    }

    protected java.lang.String exceptionInSubResolver$str() {
        return exceptionInSubResolver;
    }

    public final java.lang.String unableToQueryDatabaseMetadata() {
        java.lang.String result = java.lang.String.format(unableToQueryDatabaseMetadata$str());
        return result;
    }

    protected java.lang.String unableToQueryDatabaseMetadata$str() {
        return unableToQueryDatabaseMetadata;
    }

    public final void entityManagerClosedBySomeoneElse(final java.lang.String autoCloseSession) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, entityManagerClosedBySomeoneElse$str(), autoCloseSession);
    }

    protected java.lang.String entityManagerClosedBySomeoneElse$str() {
        return entityManagerClosedBySomeoneElse;
    }

    public final void connectionsObtained(final long connectCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, connectionsObtained$str(), connectCount);
    }

    protected java.lang.String connectionsObtained$str() {
        return connectionsObtained;
    }

    public final void unableToCloseConnection(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCloseConnection$str());
    }

    protected java.lang.String unableToCloseConnection$str() {
        return unableToCloseConnection;
    }

    public final void noAppropriateConnectionProvider() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, noAppropriateConnectionProvider$str());
    }

    protected java.lang.String noAppropriateConnectionProvider$str() {
        return noAppropriateConnectionProvider;
    }

    public final void unableToWriteCachedFile(final java.lang.String path, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToWriteCachedFile$str(), path, message);
    }

    protected java.lang.String unableToWriteCachedFile$str() {
        return unableToWriteCachedFile;
    }

    public final void hsqldbSupportsOnlyReadCommittedIsolation() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, hsqldbSupportsOnlyReadCommittedIsolation$str());
    }

    protected java.lang.String hsqldbSupportsOnlyReadCommittedIsolation$str() {
        return hsqldbSupportsOnlyReadCommittedIsolation;
    }

    public final void recognizedObsoleteHibernateNamespace(final java.lang.String oldHibernateNamespace, final java.lang.String hibernateNamespace) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, recognizedObsoleteHibernateNamespace$str(), oldHibernateNamespace, hibernateNamespace);
    }

    protected java.lang.String recognizedObsoleteHibernateNamespace$str() {
        return recognizedObsoleteHibernateNamespace;
    }

    public final void cannotResolveNonNullableTransientDependencies(final java.lang.String transientEntityString, final java.util.Set dependentEntityStrings, final java.util.Set nonNullableAssociationPaths) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, cannotResolveNonNullableTransientDependencies$str(), transientEntityString, dependentEntityStrings, nonNullableAssociationPaths);
    }

    protected java.lang.String cannotResolveNonNullableTransientDependencies$str() {
        return cannotResolveNonNullableTransientDependencies;
    }

    public final void unableToCloseOutputStream(final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCloseOutputStream$str());
    }

    protected java.lang.String unableToCloseOutputStream$str() {
        return unableToCloseOutputStream;
    }

    public final void parsingXmlErrorForFile(final java.lang.String file, final int lineNumber, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, parsingXmlErrorForFile$str(), file, lineNumber, message);
    }

    protected java.lang.String parsingXmlErrorForFile$str() {
        return parsingXmlErrorForFile;
    }

    public final void readingMappingsFromFile(final java.lang.String path) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, readingMappingsFromFile$str(), path);
    }

    protected java.lang.String readingMappingsFromFile$str() {
        return readingMappingsFromFile;
    }

    public final void usingDialect(final Dialect dialect) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingDialect$str(), dialect);
    }

    protected java.lang.String usingDialect$str() {
        return usingDialect;
    }

    public final void JavaSqlTypesMappedSameCodeMultipleTimes(final int code, final java.lang.String old, final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, JavaSqlTypesMappedSameCodeMultipleTimes$str(), code, old, name);
    }

    protected java.lang.String JavaSqlTypesMappedSameCodeMultipleTimes$str() {
        return JavaSqlTypesMappedSameCodeMultipleTimes;
    }

    public final void unableToReleaseCreatedMBeanServer(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToReleaseCreatedMBeanServer$str(), string);
    }

    protected java.lang.String unableToReleaseCreatedMBeanServer$str() {
        return unableToReleaseCreatedMBeanServer;
    }

    public final void deprecatedManyToManyFetch() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedManyToManyFetch$str());
    }

    protected java.lang.String deprecatedManyToManyFetch$str() {
        return deprecatedManyToManyFetch;
    }

    public final void entitiesFetched(final long entityFetchCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, entitiesFetched$str(), entityFetchCount);
    }

    protected java.lang.String entitiesFetched$str() {
        return entitiesFetched;
    }

    public final void entityManagerFactoryAlreadyRegistered(final java.lang.String emfName, final java.lang.String propertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, entityManagerFactoryAlreadyRegistered$str(), emfName, propertyName);
    }

    protected java.lang.String entityManagerFactoryAlreadyRegistered$str() {
        return entityManagerFactoryAlreadyRegistered;
    }

    public final void unableToRollbackIsolatedTransaction(final java.lang.Exception e, final java.lang.Exception ignore) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToRollbackIsolatedTransaction$str(), e, ignore);
    }

    protected java.lang.String unableToRollbackIsolatedTransaction$str() {
        return unableToRollbackIsolatedTransaction;
    }

    public final void addingOverrideFor(final java.lang.String name, final java.lang.String name2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, addingOverrideFor$str(), name, name2);
    }

    protected java.lang.String addingOverrideFor$str() {
        return addingOverrideFor;
    }

    public final java.lang.String unableToLocateConfigFile(final java.lang.String path) {
        java.lang.String result = java.lang.String.format(unableToLocateConfigFile$str(), path);
        return result;
    }

    protected java.lang.String unableToLocateConfigFile$str() {
        return unableToLocateConfigFile;
    }

    public final void runningSchemaValidator() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, runningSchemaValidator$str());
    }

    protected java.lang.String runningSchemaValidator$str() {
        return runningSchemaValidator;
    }

    public final void configurationResource(final java.lang.String resource) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configurationResource$str(), resource);
    }

    protected java.lang.String configurationResource$str() {
        return configurationResource;
    }

    public final java.lang.String jdbcRollbackFailed() {
        java.lang.String result = java.lang.String.format(jdbcRollbackFailed$str());
        return result;
    }

    protected java.lang.String jdbcRollbackFailed$str() {
        return jdbcRollbackFailed;
    }

    public final void runningHbm2ddlSchemaExport() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, runningHbm2ddlSchemaExport$str());
    }

    protected java.lang.String runningHbm2ddlSchemaExport$str() {
        return runningHbm2ddlSchemaExport;
    }

    public final void jdbcAutoCommitFalseBreaksEjb3Spec(final java.lang.String autocommit) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, jdbcAutoCommitFalseBreaksEjb3Spec$str(), autocommit);
    }

    protected java.lang.String jdbcAutoCommitFalseBreaksEjb3Spec$str() {
        return jdbcAutoCommitFalseBreaksEjb3Spec;
    }

    public final void exceptionInBeforeTransactionCompletionInterceptor(final java.lang.Throwable e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), exceptionInBeforeTransactionCompletionInterceptor$str());
    }

    protected java.lang.String exceptionInBeforeTransactionCompletionInterceptor$str() {
        return exceptionInBeforeTransactionCompletionInterceptor;
    }

    public final void unableToLocateMBeanServer() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLocateMBeanServer$str());
    }

    protected java.lang.String unableToLocateMBeanServer$str() {
        return unableToLocateMBeanServer;
    }

    public final void failSafeEntitiesCleanup(final EntityLoadContext entityLoadContext) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, failSafeEntitiesCleanup$str(), entityLoadContext);
    }

    protected java.lang.String failSafeEntitiesCleanup$str() {
        return failSafeEntitiesCleanup;
    }

    public final void unknownIngresVersion(final int databaseMajorVersion) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unknownIngresVersion$str(), databaseMajorVersion);
    }

    protected java.lang.String unknownIngresVersion$str() {
        return unknownIngresVersion;
    }

    public final void invalidArrayElementType(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, invalidArrayElementType$str(), message);
    }

    protected java.lang.String invalidArrayElementType$str() {
        return invalidArrayElementType;
    }

    public final void timestampCacheHits(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, timestampCacheHits$str(), updateTimestampsCachePutCount);
    }

    protected java.lang.String timestampCacheHits$str() {
        return timestampCacheHits;
    }

    public final void secondLevelCacheMisses(final long secondLevelCacheMissCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, secondLevelCacheMisses$str(), secondLevelCacheMissCount);
    }

    protected java.lang.String secondLevelCacheMisses$str() {
        return secondLevelCacheMisses;
    }

    public final void noDefaultConstructor(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, noDefaultConstructor$str(), name);
    }

    protected java.lang.String noDefaultConstructor$str() {
        return noDefaultConstructor;
    }

    public final void batchContainedStatementsOnRelease() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, batchContainedStatementsOnRelease$str());
    }

    protected java.lang.String batchContainedStatementsOnRelease$str() {
        return batchContainedStatementsOnRelease;
    }

    public final void usingReflectionOptimizer() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingReflectionOptimizer$str());
    }

    protected java.lang.String usingReflectionOptimizer$str() {
        return usingReflectionOptimizer;
    }

    public final void unableToDropTemporaryIdTable(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToDropTemporaryIdTable$str(), message);
    }

    protected java.lang.String unableToDropTemporaryIdTable$str() {
        return unableToDropTemporaryIdTable;
    }

    public final void configuringFromResource(final java.lang.String resource) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configuringFromResource$str(), resource);
    }

    protected java.lang.String configuringFromResource$str() {
        return configuringFromResource;
    }

    public final void unableToCreateSchema(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCreateSchema$str());
    }

    protected java.lang.String unableToCreateSchema$str() {
        return unableToCreateSchema;
    }

    public final void invalidTableAnnotation(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidTableAnnotation$str(), className);
    }

    protected java.lang.String invalidTableAnnotation$str() {
        return invalidTableAnnotation;
    }

    public final void callingJoinTransactionOnNonJtaEntityManager() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, callingJoinTransactionOnNonJtaEntityManager$str());
    }

    protected java.lang.String callingJoinTransactionOnNonJtaEntityManager$str() {
        return callingJoinTransactionOnNonJtaEntityManager;
    }

    public final void noColumnsSpecifiedForIndex(final java.lang.String indexName, final java.lang.String tableName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, noColumnsSpecifiedForIndex$str(), indexName, tableName);
    }

    protected java.lang.String noColumnsSpecifiedForIndex$str() {
        return noColumnsSpecifiedForIndex;
    }

    public final void illegalPropertyGetterArgument(final java.lang.String name, final java.lang.String propertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, illegalPropertyGetterArgument$str(), name, propertyName);
    }

    protected java.lang.String illegalPropertyGetterArgument$str() {
        return illegalPropertyGetterArgument;
    }

    public final void unableToBuildEnhancementMetamodel(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToBuildEnhancementMetamodel$str(), className);
    }

    protected java.lang.String unableToBuildEnhancementMetamodel$str() {
        return unableToBuildEnhancementMetamodel;
    }

    public final void cacheProvider(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, cacheProvider$str(), name);
    }

    protected java.lang.String cacheProvider$str() {
        return cacheProvider;
    }

    public final void unableToLocateConfiguredSchemaNameResolver(final java.lang.String resolverClassName, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLocateConfiguredSchemaNameResolver$str(), resolverClassName, message);
    }

    protected java.lang.String unableToLocateConfiguredSchemaNameResolver$str() {
        return unableToLocateConfiguredSchemaNameResolver;
    }

    public final void firstOrMaxResultsSpecifiedWithCollectionFetch() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, firstOrMaxResultsSpecifiedWithCollectionFetch$str());
    }

    protected java.lang.String firstOrMaxResultsSpecifiedWithCollectionFetch$str() {
        return firstOrMaxResultsSpecifiedWithCollectionFetch;
    }

    public final void propertiesLoaded(final java.util.Properties maskOut) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, propertiesLoaded$str(), maskOut);
    }

    protected java.lang.String propertiesLoaded$str() {
        return propertiesLoaded;
    }

    public final void deprecatedUuidGenerator(final java.lang.String name, final java.lang.String name2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedUuidGenerator$str(), name, name2);
    }

    protected java.lang.String deprecatedUuidGenerator$str() {
        return deprecatedUuidGenerator;
    }

    public final void unableToCloseInputFiles(final java.lang.String name, final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCloseInputFiles$str(), name);
    }

    protected java.lang.String unableToCloseInputFiles$str() {
        return unableToCloseInputFiles;
    }

    public final void unableToToggleAutoCommit(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToToggleAutoCommit$str());
    }

    protected java.lang.String unableToToggleAutoCommit$str() {
        return unableToToggleAutoCommit;
    }

    public final void usingFollowOnLocking() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, usingFollowOnLocking$str());
    }

    protected java.lang.String usingFollowOnLocking$str() {
        return usingFollowOnLocking;
    }

    public final void unableToGetDatabaseMetadata(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToGetDatabaseMetadata$str());
    }

    protected java.lang.String unableToGetDatabaseMetadata$str() {
        return unableToGetDatabaseMetadata;
    }

    public final void invalidDiscriminatorAnnotation(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidDiscriminatorAnnotation$str(), className);
    }

    protected java.lang.String invalidDiscriminatorAnnotation$str() {
        return invalidDiscriminatorAnnotation;
    }

    public final void unableToUpdateQueryHiValue(final java.lang.String tableName, final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToUpdateQueryHiValue$str(), tableName);
    }

    protected java.lang.String unableToUpdateQueryHiValue$str() {
        return unableToUpdateQueryHiValue;
    }

    public final void unsupportedNamedParameters() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedNamedParameters$str());
    }

    protected java.lang.String unsupportedNamedParameters$str() {
        return unsupportedNamedParameters;
    }

    public final void processingPersistenceUnitInfoName(final java.lang.String persistenceUnitName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, processingPersistenceUnitInfoName$str(), persistenceUnitName);
    }

    protected java.lang.String processingPersistenceUnitInfoName$str() {
        return processingPersistenceUnitInfoName;
    }

    public final void containsJoinFetchedCollection(final java.lang.String role) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, containsJoinFetchedCollection$str(), role);
    }

    protected java.lang.String containsJoinFetchedCollection$str() {
        return containsJoinFetchedCollection;
    }

    public final void unsupportedAfterStatement() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedAfterStatement$str());
    }

    protected java.lang.String unsupportedAfterStatement$str() {
        return unsupportedAfterStatement;
    }

    public final void unableToReleaseIsolatedConnection(final java.lang.Throwable ignore) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToReleaseIsolatedConnection$str(), ignore);
    }

    protected java.lang.String unableToReleaseIsolatedConnection$str() {
        return unableToReleaseIsolatedConnection;
    }

    public final void compositeIdClassDoesNotOverrideHashCode(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, compositeIdClassDoesNotOverrideHashCode$str(), name);
    }

    protected java.lang.String compositeIdClassDoesNotOverrideHashCode$str() {
        return compositeIdClassDoesNotOverrideHashCode;
    }

    public final void embedXmlAttributesNoLongerSupported() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, embedXmlAttributesNoLongerSupported$str());
    }

    protected java.lang.String embedXmlAttributesNoLongerSupported$str() {
        return embedXmlAttributesNoLongerSupported;
    }

    public final void factoryUnboundFromJndiName(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, factoryUnboundFromJndiName$str(), name);
    }

    protected java.lang.String factoryUnboundFromJndiName$str() {
        return factoryUnboundFromJndiName;
    }

    public final void pooledOptimizerReportedInitialValue(final IntegralDataTypeHolder value) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, pooledOptimizerReportedInitialValue$str(), value);
    }

    protected java.lang.String pooledOptimizerReportedInitialValue$str() {
        return pooledOptimizerReportedInitialValue;
    }

    public final void queryCacheHits(final long queryCacheHitCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, queryCacheHits$str(), queryCacheHitCount);
    }

    protected java.lang.String queryCacheHits$str() {
        return queryCacheHits;
    }

    public final java.lang.String jdbcUrlNotSpecified(final java.lang.String url) {
        java.lang.String result = java.lang.String.format(jdbcUrlNotSpecified$str(), url);
        return result;
    }

    protected java.lang.String jdbcUrlNotSpecified$str() {
        return jdbcUrlNotSpecified;
    }

    public final void unknownSqlServerVersion(final int databaseMajorVersion) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unknownSqlServerVersion$str(), databaseMajorVersion);
    }

    protected java.lang.String unknownSqlServerVersion$str() {
        return unknownSqlServerVersion;
    }

    public final void unableToReadColumnValueFromResultSet(final java.lang.String name, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToReadColumnValueFromResultSet$str(), name, message);
    }

    protected java.lang.String unableToReadColumnValueFromResultSet$str() {
        return unableToReadColumnValueFromResultSet;
    }

    public final void preparedStatementAlreadyInBatch(final java.lang.String sql) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, preparedStatementAlreadyInBatch$str(), sql);
    }

    protected java.lang.String preparedStatementAlreadyInBatch$str() {
        return preparedStatementAlreadyInBatch;
    }

    public final void unableToJoinTransaction(final java.lang.String transactionStrategy) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToJoinTransaction$str(), transactionStrategy);
    }

    protected java.lang.String unableToJoinTransaction$str() {
        return unableToJoinTransaction;
    }

    public final void containerProvidingNullPersistenceUnitRootUrl() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, containerProvidingNullPersistenceUnitRootUrl$str());
    }

    protected java.lang.String containerProvidingNullPersistenceUnitRootUrl$str() {
        return containerProvidingNullPersistenceUnitRootUrl;
    }

    public final void gettersOfLazyClassesCannotBeFinal(final java.lang.String entityName, final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, gettersOfLazyClassesCannotBeFinal$str(), entityName, name);
    }

    protected java.lang.String gettersOfLazyClassesCannotBeFinal$str() {
        return gettersOfLazyClassesCannotBeFinal;
    }

    public final void foundMappingDocument(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, foundMappingDocument$str(), name);
    }

    protected java.lang.String foundMappingDocument$str() {
        return foundMappingDocument;
    }

    public final void unableToInstantiateConfiguredSchemaNameResolver(final java.lang.String resolverClassName, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToInstantiateConfiguredSchemaNameResolver$str(), resolverClassName, message);
    }

    protected java.lang.String unableToInstantiateConfiguredSchemaNameResolver$str() {
        return unableToInstantiateConfiguredSchemaNameResolver;
    }

    public final void narrowingProxy(final java.lang.Class concreteProxyClass) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, narrowingProxy$str(), concreteProxyClass);
    }

    protected java.lang.String narrowingProxy$str() {
        return narrowingProxy;
    }

    public final void runningHbm2ddlSchemaUpdate() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, runningHbm2ddlSchemaUpdate$str());
    }

    protected java.lang.String runningHbm2ddlSchemaUpdate$str() {
        return runningHbm2ddlSchemaUpdate;
    }

    public final void unableToBindValueToParameter(final java.lang.String nullSafeToString, final int index, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToBindValueToParameter$str(), nullSafeToString, index, message);
    }

    protected java.lang.String unableToBindValueToParameter$str() {
        return unableToBindValueToParameter;
    }

    public final void collectionsLoaded(final long collectionLoadCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, collectionsLoaded$str(), collectionLoadCount);
    }

    protected java.lang.String collectionsLoaded$str() {
        return collectionsLoaded;
    }

    public final void parsingXmlWarningForFile(final java.lang.String file, final int lineNumber, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, parsingXmlWarningForFile$str(), file, lineNumber, message);
    }

    protected java.lang.String parsingXmlWarningForFile$str() {
        return parsingXmlWarningForFile;
    }

    public final void queryCacheMisses(final long queryCacheMissCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, queryCacheMisses$str(), queryCacheMissCount);
    }

    protected java.lang.String queryCacheMisses$str() {
        return queryCacheMisses;
    }

    public final void unableToLocateCustomOptimizerClass(final java.lang.String type) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLocateCustomOptimizerClass$str(), type);
    }

    protected java.lang.String unableToLocateCustomOptimizerClass$str() {
        return unableToLocateCustomOptimizerClass;
    }

    public final void loadingCollectionKeyNotFound(final CollectionKey collectionKey) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, loadingCollectionKeyNotFound$str(), collectionKey);
    }

    protected java.lang.String loadingCollectionKeyNotFound$str() {
        return loadingCollectionKeyNotFound;
    }

    public final void multipleValidationModes(final java.lang.String modes) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, multipleValidationModes$str(), modes);
    }

    protected java.lang.String multipleValidationModes$str() {
        return multipleValidationModes;
    }

    public final void unableToStopHibernateService(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToStopHibernateService$str());
    }

    protected java.lang.String unableToStopHibernateService$str() {
        return unableToStopHibernateService;
    }

    public final void autoFlushWillNotWork() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, autoFlushWillNotWork$str());
    }

    protected java.lang.String autoFlushWillNotWork$str() {
        return autoFlushWillNotWork;
    }

    public final void usingUuidHexGenerator(final java.lang.String name, final java.lang.String name2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, usingUuidHexGenerator$str(), name, name2);
    }

    protected java.lang.String usingUuidHexGenerator$str() {
        return usingUuidHexGenerator;
    }

    public final void usingTimestampWorkaround() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingTimestampWorkaround$str());
    }

    protected java.lang.String usingTimestampWorkaround$str() {
        return usingTimestampWorkaround;
    }

    public final void unableToWrapResultSet(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), (e), unableToWrapResultSet$str());
    }

    protected java.lang.String unableToWrapResultSet$str() {
        return unableToWrapResultSet;
    }

    public final void tableFound(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, tableFound$str(), string);
    }

    protected java.lang.String tableFound$str() {
        return tableFound;
    }

    public final void disablingContextualLOBCreationSinceOldJdbcVersion(final int jdbcMajorVersion) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, disablingContextualLOBCreationSinceOldJdbcVersion$str(), jdbcMajorVersion);
    }

    protected java.lang.String disablingContextualLOBCreationSinceOldJdbcVersion$str() {
        return disablingContextualLOBCreationSinceOldJdbcVersion;
    }

    public final void unableToCleanUpPreparedStatement(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCleanUpPreparedStatement$str());
    }

    protected java.lang.String unableToCleanUpPreparedStatement$str() {
        return unableToCleanUpPreparedStatement;
    }

    public final void processEqualityExpression() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, processEqualityExpression$str());
    }

    protected java.lang.String processEqualityExpression$str() {
        return processEqualityExpression;
    }

    public final void unableToReleaseTypeInfoResultSet() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToReleaseTypeInfoResultSet$str());
    }

    protected java.lang.String unableToReleaseTypeInfoResultSet$str() {
        return unableToReleaseTypeInfoResultSet;
    }

    public final void rdmsOs2200Dialect() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, rdmsOs2200Dialect$str());
    }

    protected java.lang.String rdmsOs2200Dialect$str() {
        return rdmsOs2200Dialect;
    }

    public final void unableToReadOrInitHiValue(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToReadOrInitHiValue$str());
    }

    protected java.lang.String unableToReadOrInitHiValue$str() {
        return unableToReadOrInitHiValue;
    }

    public final void queriesExecuted(final long queryExecutionCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, queriesExecuted$str(), queryExecutionCount);
    }

    protected java.lang.String queriesExecuted$str() {
        return queriesExecuted;
    }

    public final void unableToAccessEjb3Configuration(final javax.naming.NamingException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToAccessEjb3Configuration$str());
    }

    protected java.lang.String unableToAccessEjb3Configuration$str() {
        return unableToAccessEjb3Configuration;
    }

    public final java.lang.String unableToDetermineTransactionStatus() {
        java.lang.String result = java.lang.String.format(unableToDetermineTransactionStatus$str());
        return result;
    }

    protected java.lang.String unableToDetermineTransactionStatus$str() {
        return unableToDetermineTransactionStatus;
    }

    public final void sortAnnotationIndexedCollection() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, sortAnnotationIndexedCollection$str());
    }

    protected java.lang.String sortAnnotationIndexedCollection$str() {
        return sortAnnotationIndexedCollection;
    }

    public final void unexpectedLiteralTokenType(final int type) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unexpectedLiteralTokenType$str(), type);
    }

    protected java.lang.String unexpectedLiteralTokenType$str() {
        return unexpectedLiteralTokenType;
    }

    public final void transactionStrategy(final java.lang.String strategyClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, transactionStrategy$str(), strategyClassName);
    }

    protected java.lang.String transactionStrategy$str() {
        return transactionStrategy;
    }

    public final void sessionsOpened(final long sessionOpenCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, sessionsOpened$str(), sessionOpenCount);
    }

    protected java.lang.String sessionsOpened$str() {
        return sessionsOpened;
    }

    public final void persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str());
    }

    protected java.lang.String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str() {
        return persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly;
    }

    public final java.lang.Object unableToUpdateHiValue(final java.lang.String tableName) {
        java.lang.Object result = java.lang.String.format(unableToUpdateHiValue$str(), tableName);
        return result;
    }

    protected java.lang.String unableToUpdateHiValue$str() {
        return unableToUpdateHiValue;
    }

    public final void unableToCloseSession(final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCloseSession$str());
    }

    protected java.lang.String unableToCloseSession$str() {
        return unableToCloseSession;
    }

    public final void duplicateGeneratorTable(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, duplicateGeneratorTable$str(), name);
    }

    protected java.lang.String duplicateGeneratorTable$str() {
        return duplicateGeneratorTable;
    }

    public final void usingDriver(final java.lang.String driverClassName, final java.lang.String url) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingDriver$str(), driverClassName, url);
    }

    protected java.lang.String usingDriver$str() {
        return usingDriver;
    }

    public final void readingMappingsFromResource(final java.lang.String resourceName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, readingMappingsFromResource$str(), resourceName);
    }

    protected java.lang.String readingMappingsFromResource$str() {
        return readingMappingsFromResource;
    }

    public final void unableToReadClass(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToReadClass$str(), message);
    }

    protected java.lang.String unableToReadClass$str() {
        return unableToReadClass;
    }

    public final void incompleteMappingMetadataCacheProcessing() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, incompleteMappingMetadataCacheProcessing$str());
    }

    protected java.lang.String incompleteMappingMetadataCacheProcessing$str() {
        return incompleteMappingMetadataCacheProcessing;
    }

    public final void jndiInitialContextProperties(final Hashtable hash) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, jndiInitialContextProperties$str(), hash);
    }

    protected java.lang.String jndiInitialContextProperties$str() {
        return jndiInitialContextProperties;
    }

    public final void alternateServiceRole(final java.lang.String requestedRole, final java.lang.String targetRole) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, alternateServiceRole$str(), requestedRole, targetRole);
    }

    protected java.lang.String alternateServiceRole$str() {
        return alternateServiceRole;
    }

    public final void ignoringUnrecognizedQueryHint(final java.lang.String hintName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, ignoringUnrecognizedQueryHint$str(), hintName);
    }

    protected java.lang.String ignoringUnrecognizedQueryHint$str() {
        return ignoringUnrecognizedQueryHint;
    }

    public final void unableToInstantiateUuidGenerationStrategy(final java.lang.Exception ignore) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToInstantiateUuidGenerationStrategy$str(), ignore);
    }

    protected java.lang.String unableToInstantiateUuidGenerationStrategy$str() {
        return unableToInstantiateUuidGenerationStrategy;
    }

    public final void entitiesLoaded(final long entityLoadCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, entitiesLoaded$str(), entityLoadCount);
    }

    protected java.lang.String entitiesLoaded$str() {
        return entitiesLoaded;
    }

    public final void undeterminedH2Version() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, undeterminedH2Version$str());
    }

    protected java.lang.String undeterminedH2Version$str() {
        return undeterminedH2Version;
    }

    public final void deprecatedOracleDialect() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedOracleDialect$str());
    }

    protected java.lang.String deprecatedOracleDialect$str() {
        return deprecatedOracleDialect;
    }

    public final void sqlWarning(final int errorCode, final java.lang.String sqlState) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, sqlWarning$str(), errorCode, sqlState);
    }

    protected java.lang.String sqlWarning$str() {
        return sqlWarning;
    }

    public final void unableToCloseInputStreamForResource(final java.lang.String resourceName, final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCloseInputStreamForResource$str(), resourceName);
    }

    protected java.lang.String unableToCloseInputStreamForResource$str() {
        return unableToCloseInputStreamForResource;
    }

    public final void unableToDestroyCache(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToDestroyCache$str(), message);
    }

    protected java.lang.String unableToDestroyCache$str() {
        return unableToDestroyCache;
    }

    public final java.lang.String javassistEnhancementFailed(final java.lang.String entityName) {
        java.lang.String result = java.lang.String.format(javassistEnhancementFailed$str(), entityName);
        return result;
    }

    protected java.lang.String javassistEnhancementFailed$str() {
        return javassistEnhancementFailed;
    }

    public final void unableToCloseSessionButSwallowingError(final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToCloseSessionButSwallowingError$str(), e);
    }

    protected java.lang.String unableToCloseSessionButSwallowingError$str() {
        return unableToCloseSessionButSwallowingError;
    }

    public final void closing() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, closing$str());
    }

    protected java.lang.String closing$str() {
        return closing;
    }

    public final void readingCachedMappings(final File cachedFile) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, readingCachedMappings$str(), cachedFile);
    }

    protected java.lang.String readingCachedMappings$str() {
        return readingCachedMappings;
    }

    public final void expired(final java.lang.Object key) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, expired$str(), key);
    }

    protected java.lang.String expired$str() {
        return expired;
    }

    public final void duplicateListener(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, duplicateListener$str(), className);
    }

    protected java.lang.String duplicateListener$str() {
        return duplicateListener;
    }

    public final void maxQueryTime(final long queryExecutionMaxTime) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, maxQueryTime$str(), queryExecutionMaxTime);
    }

    protected java.lang.String maxQueryTime$str() {
        return maxQueryTime;
    }

    public final void successfulTransactions(final long committedTransactionCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, successfulTransactions$str(), committedTransactionCount);
    }

    protected java.lang.String successfulTransactions$str() {
        return successfulTransactions;
    }

    public final java.lang.String unableToDetermineTransactionStatusAfterCommit() {
        java.lang.String result = java.lang.String.format(unableToDetermineTransactionStatusAfterCommit$str());
        return result;
    }

    protected java.lang.String unableToDetermineTransactionStatusAfterCommit$str() {
        return unableToDetermineTransactionStatusAfterCommit;
    }

    public final java.lang.String unableToRollbackJta() {
        java.lang.String result = java.lang.String.format(unableToRollbackJta$str());
        return result;
    }

    protected java.lang.String unableToRollbackJta$str() {
        return unableToRollbackJta;
    }

    public final void timestampCachePuts(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, timestampCachePuts$str(), updateTimestampsCachePutCount);
    }

    protected java.lang.String timestampCachePuts$str() {
        return timestampCachePuts;
    }

    public final void unableToRetrieveCache(final java.lang.String namespace, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToRetrieveCache$str(), namespace, message);
    }

    protected java.lang.String unableToRetrieveCache$str() {
        return unableToRetrieveCache;
    }

    public final void configuringFromFile(final java.lang.String file) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configuringFromFile$str(), file);
    }

    protected java.lang.String configuringFromFile$str() {
        return configuringFromFile;
    }

    public final void jdbcIsolationLevel(final java.lang.String isolationLevelToString) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, jdbcIsolationLevel$str(), isolationLevelToString);
    }

    protected java.lang.String jdbcIsolationLevel$str() {
        return jdbcIsolationLevel;
    }

    public final void naturalIdQueriesExecuted(final long naturalIdQueriesExecutionCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, naturalIdQueriesExecuted$str(), naturalIdQueriesExecutionCount);
    }

    protected java.lang.String naturalIdQueriesExecuted$str() {
        return naturalIdQueriesExecuted;
    }

    public final void searchingForMappingDocuments(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, searchingForMappingDocuments$str(), name);
    }

    protected java.lang.String searchingForMappingDocuments$str() {
        return searchingForMappingDocuments;
    }

    public final void transactionStartedOnNonRootSession() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, transactionStartedOnNonRootSession$str());
    }

    protected java.lang.String transactionStartedOnNonRootSession$str() {
        return transactionStartedOnNonRootSession;
    }

    public final void unableToParseMetadata(final java.lang.String packageName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToParseMetadata$str(), packageName);
    }

    protected java.lang.String unableToParseMetadata$str() {
        return unableToParseMetadata;
    }

    public final void unableToAccessTypeInfoResultSet(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToAccessTypeInfoResultSet$str(), string);
    }

    protected java.lang.String unableToAccessTypeInfoResultSet$str() {
        return unableToAccessTypeInfoResultSet;
    }

    public final void unableToStopService(final java.lang.Class class1, final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToStopService$str(), class1, string);
    }

    protected java.lang.String unableToStopService$str() {
        return unableToStopService;
    }

    public final void namedQueryError(final java.lang.String queryName, final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), namedQueryError$str(), queryName);
    }

    protected java.lang.String namedQueryError$str() {
        return namedQueryError;
    }

    public final void unsupportedOracleVersion() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedOracleVersion$str());
    }

    protected java.lang.String unsupportedOracleVersion$str() {
        return unsupportedOracleVersion;
    }

    public final void collectionsFetched(final long collectionFetchCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, collectionsFetched$str(), collectionFetchCount);
    }

    protected java.lang.String collectionsFetched$str() {
        return collectionsFetched;
    }

    public final void naturalIdCachePuts(final long naturalIdCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, naturalIdCachePuts$str(), naturalIdCachePutCount);
    }

    protected java.lang.String naturalIdCachePuts$str() {
        return naturalIdCachePuts;
    }

    public final void queryCachePuts(final long queryCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, queryCachePuts$str(), queryCachePutCount);
    }

    protected java.lang.String queryCachePuts$str() {
        return queryCachePuts;
    }

    public final void applyingExplicitDiscriminatorColumnForJoined(final java.lang.String className, final java.lang.String overrideSetting) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, applyingExplicitDiscriminatorColumnForJoined$str(), className, overrideSetting);
    }

    protected java.lang.String applyingExplicitDiscriminatorColumnForJoined$str() {
        return applyingExplicitDiscriminatorColumnForJoined;
    }

    public final void rollbackFromBackgroundThread(final int status) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, rollbackFromBackgroundThread$str(), status);
    }

    protected java.lang.String rollbackFromBackgroundThread$str() {
        return rollbackFromBackgroundThread;
    }

    public final void disablingContextualLOBCreation(final java.lang.String nonContextualLobCreation) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, disablingContextualLOBCreation$str(), nonContextualLobCreation);
    }

    protected java.lang.String disablingContextualLOBCreation$str() {
        return disablingContextualLOBCreation;
    }

    public final void c3p0ProviderClassNotFound(final java.lang.String c3p0ProviderClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, c3p0ProviderClassNotFound$str(), c3p0ProviderClassName);
    }

    protected java.lang.String c3p0ProviderClassNotFound$str() {
        return c3p0ProviderClassNotFound;
    }

    public final void schemaExportUnsuccessful(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), schemaExportUnsuccessful$str());
    }

    protected java.lang.String schemaExportUnsuccessful$str() {
        return schemaExportUnsuccessful;
    }

    public final void unableToObjectConnectionToQueryMetadata(final java.sql.SQLException error) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToObjectConnectionToQueryMetadata$str(), error);
    }

    protected java.lang.String unableToObjectConnectionToQueryMetadata$str() {
        return unableToObjectConnectionToQueryMetadata;
    }

    public final void usingAstQueryTranslatorFactory() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingAstQueryTranslatorFactory$str());
    }

    protected java.lang.String usingAstQueryTranslatorFactory$str() {
        return usingAstQueryTranslatorFactory;
    }

    public final void unableToBindFactoryToJndi(final org.hibernate.engine.jndi.JndiException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToBindFactoryToJndi$str());
    }

    protected java.lang.String unableToBindFactoryToJndi$str() {
        return unableToBindFactoryToJndi;
    }

    public final void unableToSwitchToMethodUsingColumnIndex(final Method method) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToSwitchToMethodUsingColumnIndex$str(), method);
    }

    protected java.lang.String unableToSwitchToMethodUsingColumnIndex$str() {
        return unableToSwitchToMethodUsingColumnIndex;
    }

    public final void needsLimit() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, needsLimit$str());
    }

    protected java.lang.String needsLimit$str() {
        return needsLimit;
    }

    public final void fetchingDatabaseMetadata() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, fetchingDatabaseMetadata$str());
    }

    protected java.lang.String fetchingDatabaseMetadata$str() {
        return fetchingDatabaseMetadata;
    }

    public final void warningsCreatingTempTable(final SQLWarning warning) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, warningsCreatingTempTable$str(), warning);
    }

    protected java.lang.String warningsCreatingTempTable$str() {
        return warningsCreatingTempTable;
    }

    public final void immutableAnnotationOnNonRoot(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, immutableAnnotationOnNonRoot$str(), className);
    }

    protected java.lang.String immutableAnnotationOnNonRoot$str() {
        return immutableAnnotationOnNonRoot;
    }

    public final void statementsClosed(final long closeStatementCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, statementsClosed$str(), closeStatementCount);
    }

    protected java.lang.String statementsClosed$str() {
        return statementsClosed;
    }

    public final void explicitSkipLockedLockCombo() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, explicitSkipLockedLockCombo$str());
    }

    protected java.lang.String explicitSkipLockedLockCombo$str() {
        return explicitSkipLockedLockCombo;
    }

    public final void unableToPerformManagedFlush(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToPerformManagedFlush$str(), message);
    }

    protected java.lang.String unableToPerformManagedFlush$str() {
        return unableToPerformManagedFlush;
    }

    public final void forcingContainerResourceCleanup() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, forcingContainerResourceCleanup$str());
    }

    protected java.lang.String forcingContainerResourceCleanup$str() {
        return forcingContainerResourceCleanup;
    }

    public final void jdbcDriverNotSpecified(final java.lang.String driver) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, jdbcDriverNotSpecified$str(), driver);
    }

    protected java.lang.String jdbcDriverNotSpecified$str() {
        return jdbcDriverNotSpecified;
    }

    public final void unableToDestroyUpdateTimestampsCache(final java.lang.String region, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToDestroyUpdateTimestampsCache$str(), region, message);
    }

    protected java.lang.String unableToDestroyUpdateTimestampsCache$str() {
        return unableToDestroyUpdateTimestampsCache;
    }

    public final void willNotRegisterListeners() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, willNotRegisterListeners$str());
    }

    protected java.lang.String willNotRegisterListeners$str() {
        return willNotRegisterListeners;
    }

    public final void exceptionInAfterTransactionCompletionInterceptor(final java.lang.Throwable e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), exceptionInAfterTransactionCompletionInterceptor$str());
    }

    protected java.lang.String exceptionInAfterTransactionCompletionInterceptor$str() {
        return exceptionInAfterTransactionCompletionInterceptor;
    }

    public final void unableToLoadProperties() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToLoadProperties$str());
    }

    protected java.lang.String unableToLoadProperties$str() {
        return unableToLoadProperties;
    }

    public final void unableToBuildSessionFactoryUsingMBeanClasspath(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToBuildSessionFactoryUsingMBeanClasspath$str(), message);
    }

    protected java.lang.String unableToBuildSessionFactoryUsingMBeanClasspath$str() {
        return unableToBuildSessionFactoryUsingMBeanClasspath;
    }

    public final void sessionsClosed(final long sessionCloseCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, sessionsClosed$str(), sessionCloseCount);
    }

    protected java.lang.String sessionsClosed$str() {
        return sessionsClosed;
    }

    public final void unknownOracleVersion(final int databaseMajorVersion) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unknownOracleVersion$str(), databaseMajorVersion);
    }

    protected java.lang.String unknownOracleVersion$str() {
        return unknownOracleVersion;
    }

    public final java.lang.String unableToCommitJta() {
        java.lang.String result = java.lang.String.format(unableToCommitJta$str());
        return result;
    }

    protected java.lang.String unableToCommitJta$str() {
        return unableToCommitJta;
    }

    public final void unableToSynchronizeDatabaseStateWithSession(final org.hibernate.HibernateException he) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToSynchronizeDatabaseStateWithSession$str(), he);
    }

    protected java.lang.String unableToSynchronizeDatabaseStateWithSession$str() {
        return unableToSynchronizeDatabaseStateWithSession;
    }

    public final void unableToExecuteBatch(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToExecuteBatch$str(), message);
    }

    protected java.lang.String unableToExecuteBatch$str() {
        return unableToExecuteBatch;
    }

    public final void deprecatedDerbyDialect() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, deprecatedDerbyDialect$str());
    }

    protected java.lang.String deprecatedDerbyDialect$str() {
        return deprecatedDerbyDialect;
    }

    public final void unableToCopySystemProperties() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToCopySystemProperties$str());
    }

    protected java.lang.String unableToCopySystemProperties$str() {
        return unableToCopySystemProperties;
    }

    public final void localLoadingCollectionKeysCount(final int size) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, localLoadingCollectionKeysCount$str(), size);
    }

    protected java.lang.String localLoadingCollectionKeysCount$str() {
        return localLoadingCollectionKeysCount;
    }

    public final void unableToSetTransactionToRollbackOnly(final SystemException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToSetTransactionToRollbackOnly$str());
    }

    protected java.lang.String unableToSetTransactionToRollbackOnly$str() {
        return unableToSetTransactionToRollbackOnly;
    }

    public final void invalidEditOfReadOnlyItem(final java.lang.Object key) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, invalidEditOfReadOnlyItem$str(), key);
    }

    protected java.lang.String invalidEditOfReadOnlyItem$str() {
        return invalidEditOfReadOnlyItem;
    }

    public final void nonCompliantMapConversion(final java.lang.String collectionRole) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, nonCompliantMapConversion$str(), collectionRole);
    }

    protected java.lang.String nonCompliantMapConversion$str() {
        return nonCompliantMapConversion;
    }

    public final void validatorNotFound() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, validatorNotFound$str());
    }

    protected java.lang.String validatorNotFound$str() {
        return validatorNotFound;
    }

    public final void typeRegistrationOverridesPrevious(final java.lang.String key, final Type old) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, typeRegistrationOverridesPrevious$str(), key, old);
    }

    protected java.lang.String typeRegistrationOverridesPrevious$str() {
        return typeRegistrationOverridesPrevious;
    }

    public final void jaccContextId(final java.lang.String contextId) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, jaccContextId$str(), contextId);
    }

    protected java.lang.String jaccContextId$str() {
        return jaccContextId;
    }

    public final void unableToBindEjb3ConfigurationToJndi(final org.hibernate.engine.jndi.JndiException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToBindEjb3ConfigurationToJndi$str());
    }

    protected java.lang.String unableToBindEjb3ConfigurationToJndi$str() {
        return unableToBindEjb3ConfigurationToJndi;
    }

    public final void cachedFileNotFound(final java.lang.String path, final FileNotFoundException error) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, cachedFileNotFound$str(), path, error);
    }

    protected java.lang.String cachedFileNotFound$str() {
        return cachedFileNotFound;
    }

    public final void exceptionHeaderNotFound(final java.lang.String exceptionHeader, final java.lang.String metaInfOrmXml) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, exceptionHeaderNotFound$str(), exceptionHeader, metaInfOrmXml);
    }

    protected java.lang.String exceptionHeaderNotFound$str() {
        return exceptionHeaderNotFound;
    }

    public final void synchronizationFailed(final javax.transaction.Synchronization synchronization, final java.lang.Throwable t) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, synchronizationFailed$str(), synchronization, t);
    }

    protected java.lang.String synchronizationFailed$str() {
        return synchronizationFailed;
    }

    public final void disablingContextualLOBCreationSinceCreateClobFailed(final java.lang.Throwable t) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, disablingContextualLOBCreationSinceCreateClobFailed$str(), t);
    }

    protected java.lang.String disablingContextualLOBCreationSinceCreateClobFailed$str() {
        return disablingContextualLOBCreationSinceCreateClobFailed;
    }

    public final void unableToRemoveBagJoinFetch() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToRemoveBagJoinFetch$str());
    }

    protected java.lang.String unableToRemoveBagJoinFetch$str() {
        return unableToRemoveBagJoinFetch;
    }

    public final void unableToExecuteResolver(final DialectResolver abstractDialectResolver, final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToExecuteResolver$str(), abstractDialectResolver, message);
    }

    protected java.lang.String unableToExecuteResolver$str() {
        return unableToExecuteResolver;
    }

    public final void statementsPrepared(final long prepareStatementCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, statementsPrepared$str(), prepareStatementCount);
    }

    protected java.lang.String statementsPrepared$str() {
        return statementsPrepared;
    }

    public final void unableToAccessSessionFactory(final java.lang.String sfJNDIName, final javax.naming.NamingException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToAccessSessionFactory$str(), sfJNDIName);
    }

    protected java.lang.String unableToAccessSessionFactory$str() {
        return unableToAccessSessionFactory;
    }

    public final void invalidPrimaryKeyJoinColumnAnnotation() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidPrimaryKeyJoinColumnAnnotation$str());
    }

    protected java.lang.String invalidPrimaryKeyJoinColumnAnnotation$str() {
        return invalidPrimaryKeyJoinColumnAnnotation;
    }

    public final void handlingTransientEntity() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, handlingTransientEntity$str());
    }

    protected java.lang.String handlingTransientEntity$str() {
        return handlingTransientEntity;
    }

    public final void unableToObtainInitialContext(final javax.naming.NamingException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToObtainInitialContext$str());
    }

    protected java.lang.String unableToObtainInitialContext$str() {
        return unableToObtainInitialContext;
    }

    public final void failed(final java.lang.Throwable throwable) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, failed$str(), throwable);
    }

    protected java.lang.String failed$str() {
        return failed;
    }

    public final void ignoringTableGeneratorConstraints(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, ignoringTableGeneratorConstraints$str(), name);
    }

    protected java.lang.String ignoringTableGeneratorConstraints$str() {
        return ignoringTableGeneratorConstraints;
    }

    public final void unableToCloseIterator(final java.sql.SQLException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), (e), unableToCloseIterator$str());
    }

    protected java.lang.String unableToCloseIterator$str() {
        return unableToCloseIterator;
    }

    public final void unableToCloseInputStream(final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCloseInputStream$str());
    }

    protected java.lang.String unableToCloseInputStream$str() {
        return unableToCloseInputStream;
    }

    public final void namingExceptionAccessingFactory(final javax.naming.NamingException exception) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, namingExceptionAccessingFactory$str(), exception);
    }

    protected java.lang.String namingExceptionAccessingFactory$str() {
        return namingExceptionAccessingFactory;
    }

    public final void unsuccessfulCreate(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unsuccessfulCreate$str(), string);
    }

    protected java.lang.String unsuccessfulCreate$str() {
        return unsuccessfulCreate;
    }

    public final void unableToConfigureSqlExceptionConverter(final org.hibernate.HibernateException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToConfigureSqlExceptionConverter$str(), e);
    }

    protected java.lang.String unableToConfigureSqlExceptionConverter$str() {
        return unableToConfigureSqlExceptionConverter;
    }

    public final void unableToApplyConstraints(final java.lang.String className, final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToApplyConstraints$str(), className);
    }

    protected java.lang.String unableToApplyConstraints$str() {
        return unableToApplyConstraints;
    }

    public final void unableToTransformClass(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToTransformClass$str(), message);
    }

    protected java.lang.String unableToTransformClass$str() {
        return unableToTransformClass;
    }

    public final void unableToResolveMappingFile(final java.lang.String xmlFile) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToResolveMappingFile$str(), xmlFile);
    }

    protected java.lang.String unableToResolveMappingFile$str() {
        return unableToResolveMappingFile;
    }

    public final void missingEntityAnnotation(final java.lang.String className) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, missingEntityAnnotation$str(), className);
    }

    protected java.lang.String missingEntityAnnotation$str() {
        return missingEntityAnnotation;
    }

    public final void startingQueryCache(final java.lang.String region) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, startingQueryCache$str(), region);
    }

    protected java.lang.String startingQueryCache$str() {
        return startingQueryCache;
    }

    public final void unableToCloseSessionDuringRollback(final java.lang.Exception e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), unableToCloseSessionDuringRollback$str());
    }

    protected java.lang.String unableToCloseSessionDuringRollback$str() {
        return unableToCloseSessionDuringRollback;
    }

    public final void cleaningUpConnectionPool(final java.lang.String url) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, cleaningUpConnectionPool$str(), url);
    }

    protected java.lang.String cleaningUpConnectionPool$str() {
        return cleaningUpConnectionPool;
    }

    public final void unableToUnbindFactoryFromJndi(final org.hibernate.engine.jndi.JndiException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToUnbindFactoryFromJndi$str());
    }

    protected java.lang.String unableToUnbindFactoryFromJndi$str() {
        return unableToUnbindFactoryFromJndi;
    }

    public final void unableToCloseStream(final java.io.IOException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), (e), unableToCloseStream$str());
    }

    protected java.lang.String unableToCloseStream$str() {
        return unableToCloseStream;
    }

    public final void missingArguments(final int anticipatedNumberOfArguments, final int numberOfArguments) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, missingArguments$str(), anticipatedNumberOfArguments, numberOfArguments);
    }

    protected java.lang.String missingArguments$str() {
        return missingArguments;
    }

    public final void scopingTypesToSessionFactoryAfterAlreadyScoped(final org.hibernate.engine.spi.SessionFactoryImplementor factory, final org.hibernate.engine.spi.SessionFactoryImplementor factory2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, scopingTypesToSessionFactoryAfterAlreadyScoped$str(), factory, factory2);
    }

    protected java.lang.String scopingTypesToSessionFactoryAfterAlreadyScoped$str() {
        return scopingTypesToSessionFactoryAfterAlreadyScoped;
    }

    public final void unableToFindPersistenceXmlInClasspath() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToFindPersistenceXmlInClasspath$str());
    }

    protected java.lang.String unableToFindPersistenceXmlInClasspath$str() {
        return unableToFindPersistenceXmlInClasspath;
    }

    public final void unableToCleanupTemporaryIdTable(final java.lang.Throwable t) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToCleanupTemporaryIdTable$str(), t);
    }

    protected java.lang.String unableToCleanupTemporaryIdTable$str() {
        return unableToCleanupTemporaryIdTable;
    }

    public final void invalidJndiName(final java.lang.String name, final JndiNameException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), invalidJndiName$str(), name);
    }

    protected java.lang.String invalidJndiName$str() {
        return invalidJndiName;
    }

    public final void entityIdentifierValueBindingExists(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, entityIdentifierValueBindingExists$str(), name);
    }

    protected java.lang.String entityIdentifierValueBindingExists$str() {
        return entityIdentifierValueBindingExists;
    }

    public final void noSessionFactoryWithJndiName(final java.lang.String sfJNDIName, final NameNotFoundException e) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (e), noSessionFactoryWithJndiName$str(), sfJNDIName);
    }

    protected java.lang.String noSessionFactoryWithJndiName$str() {
        return noSessionFactoryWithJndiName;
    }

    public final void propertiesNotFound() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, propertiesNotFound$str());
    }

    protected java.lang.String propertiesNotFound$str() {
        return propertiesNotFound;
    }

    public final void lazyPropertyFetchingAvailable(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, lazyPropertyFetchingAvailable$str(), name);
    }

    protected java.lang.String lazyPropertyFetchingAvailable$str() {
        return lazyPropertyFetchingAvailable;
    }

    public final void synchronizationAlreadyRegistered(final javax.transaction.Synchronization synchronization) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, synchronizationAlreadyRegistered$str(), synchronization);
    }

    protected java.lang.String synchronizationAlreadyRegistered$str() {
        return synchronizationAlreadyRegistered;
    }

    public final void usingDefaultIdGeneratorSegmentValue(final java.lang.String tableName, final java.lang.String segmentColumnName, final java.lang.String defaultToUse) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingDefaultIdGeneratorSegmentValue$str(), tableName, segmentColumnName, defaultToUse);
    }

    protected java.lang.String usingDefaultIdGeneratorSegmentValue$str() {
        return usingDefaultIdGeneratorSegmentValue;
    }

    public final void configuringFromXmlDocument() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configuringFromXmlDocument$str());
    }

    protected java.lang.String configuringFromXmlDocument$str() {
        return configuringFromXmlDocument;
    }

    public final void configuredSessionFactory(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configuredSessionFactory$str(), name);
    }

    protected java.lang.String configuredSessionFactory$str() {
        return configuredSessionFactory;
    }

    public final void indexes(final java.util.Set keySet) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, indexes$str(), keySet);
    }

    protected java.lang.String indexes$str() {
        return indexes;
    }

    public final void configuringFromUrl(final URL url) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, configuringFromUrl$str(), url);
    }

    protected java.lang.String configuringFromUrl$str() {
        return configuringFromUrl;
    }

    public final void usingOldDtd() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, usingOldDtd$str());
    }

    protected java.lang.String usingOldDtd$str() {
        return usingOldDtd;
    }

    public final void unableToReleaseCacheLock(final CacheException ce) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToReleaseCacheLock$str(), ce);
    }

    protected java.lang.String unableToReleaseCacheLock$str() {
        return unableToReleaseCacheLock;
    }

    public final void updatingSchema() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, updatingSchema$str());
    }

    protected java.lang.String updatingSchema$str() {
        return updatingSchema;
    }

    public final void unsupportedIngresVersion() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unsupportedIngresVersion$str());
    }

    protected java.lang.String unsupportedIngresVersion$str() {
        return unsupportedIngresVersion;
    }

    public final void naturalIdCacheMisses(final long naturalIdCacheMissCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, naturalIdCacheMisses$str(), naturalIdCacheMissCount);
    }

    protected java.lang.String naturalIdCacheMisses$str() {
        return naturalIdCacheMisses;
    }

    public final void factoryJndiRename(final java.lang.String oldName, final java.lang.String newName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, factoryJndiRename$str(), oldName, newName);
    }

    protected java.lang.String factoryJndiRename$str() {
        return factoryJndiRename;
    }

    public final void unableToConstructSqlExceptionConverter(final java.lang.Throwable t) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToConstructSqlExceptionConverter$str(), t);
    }

    protected java.lang.String unableToConstructSqlExceptionConverter$str() {
        return unableToConstructSqlExceptionConverter;
    }

    public final void subResolverException(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, subResolverException$str(), message);
    }

    protected java.lang.String subResolverException$str() {
        return subResolverException;
    }

    public final void unableToObjectConnectionMetadata(final java.sql.SQLException error) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToObjectConnectionMetadata$str(), error);
    }

    protected java.lang.String unableToObjectConnectionMetadata$str() {
        return unableToObjectConnectionMetadata;
    }

    public final void renamedProperty(final java.lang.Object propertyName, final java.lang.Object newPropertyName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, renamedProperty$str(), propertyName, newPropertyName);
    }

    protected java.lang.String renamedProperty$str() {
        return renamedProperty;
    }

    public final void expectedType(final java.lang.String name, final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, expectedType$str(), name, string);
    }

    protected java.lang.String expectedType$str() {
        return expectedType;
    }

    public final void unableToLogSqlWarnings(final java.sql.SQLException sqle) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToLogSqlWarnings$str(), sqle);
    }

    protected java.lang.String unableToLogSqlWarnings$str() {
        return unableToLogSqlWarnings;
    }

    public final void resolvedSqlTypeDescriptorForDifferentSqlCode(final java.lang.String name, final java.lang.String valueOf, final java.lang.String name2, final java.lang.String valueOf2) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, resolvedSqlTypeDescriptorForDifferentSqlCode$str(), name, valueOf, name2, valueOf2);
    }

    protected java.lang.String resolvedSqlTypeDescriptorForDifferentSqlCode$str() {
        return resolvedSqlTypeDescriptorForDifferentSqlCode;
    }

    public final void usingDefaultTransactionStrategy() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, usingDefaultTransactionStrategy$str());
    }

    protected java.lang.String usingDefaultTransactionStrategy$str() {
        return usingDefaultTransactionStrategy;
    }

    public final void splitQueries(final java.lang.String sourceQuery, final int length) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, splitQueries$str(), sourceQuery, length);
    }

    protected java.lang.String splitQueries$str() {
        return splitQueries;
    }

    public final void invalidOnDeleteAnnotation(final java.lang.String entityName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, invalidOnDeleteAnnotation$str(), entityName);
    }

    protected java.lang.String invalidOnDeleteAnnotation$str() {
        return invalidOnDeleteAnnotation;
    }

    public final void typeDefinedNoRegistrationKeys(final BasicType type) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, typeDefinedNoRegistrationKeys$str(), type);
    }

    protected java.lang.String typeDefinedNoRegistrationKeys$str() {
        return typeDefinedNoRegistrationKeys;
    }

    public final void usingHibernateBuiltInConnectionPool() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, usingHibernateBuiltInConnectionPool$str());
    }

    protected java.lang.String usingHibernateBuiltInConnectionPool$str() {
        return usingHibernateBuiltInConnectionPool;
    }

    public final void instantiatingExplicitConnectionProvider(final java.lang.String providerClassName) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, instantiatingExplicitConnectionProvider$str(), providerClassName);
    }

    protected java.lang.String instantiatingExplicitConnectionProvider$str() {
        return instantiatingExplicitConnectionProvider;
    }

    public final void tableNotFound(final java.lang.String name) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, tableNotFound$str(), name);
    }

    protected java.lang.String tableNotFound$str() {
        return tableNotFound;
    }

    public final void collectionsUpdated(final long collectionUpdateCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, collectionsUpdated$str(), collectionUpdateCount);
    }

    protected java.lang.String collectionsUpdated$str() {
        return collectionsUpdated;
    }

    public final void unableToCloseInitialContext(final java.lang.String string) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, unableToCloseInitialContext$str(), string);
    }

    protected java.lang.String unableToCloseInitialContext$str() {
        return unableToCloseInitialContext;
    }

    public final void unableToCloseJar(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), null, unableToCloseJar$str(), message);
    }

    protected java.lang.String unableToCloseJar$str() {
        return unableToCloseJar;
    }

    public final void propertyNotFound(final java.lang.String property) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, propertyNotFound$str(), property);
    }

    protected java.lang.String propertyNotFound$str() {
        return propertyNotFound;
    }

    public final void closingUnreleasedBatch() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, closingUnreleasedBatch$str());
    }

    protected java.lang.String closingUnreleasedBatch$str() {
        return closingUnreleasedBatch;
    }

    public final void optimisticLockFailures(final long optimisticFailureCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, optimisticLockFailures$str(), optimisticFailureCount);
    }

    protected java.lang.String optimisticLockFailures$str() {
        return optimisticLockFailures;
    }

    public final void failSafeCollectionsCleanup(final CollectionLoadContext collectionLoadContext) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, failSafeCollectionsCleanup$str(), collectionLoadContext);
    }

    protected java.lang.String failSafeCollectionsCleanup$str() {
        return failSafeCollectionsCleanup;
    }

    public final void transactions(final long transactionCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, transactions$str(), transactionCount);
    }

    protected java.lang.String transactions$str() {
        return transactions;
    }

    public final void duplicateImport(final java.lang.String entityName, final java.lang.String rename) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, duplicateImport$str(), entityName, rename);
    }

    protected java.lang.String duplicateImport$str() {
        return duplicateImport;
    }

    public final void couldNotBindJndiListener() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.DEBUG), null, couldNotBindJndiListener$str());
    }

    protected java.lang.String couldNotBindJndiListener$str() {
        return couldNotBindJndiListener;
    }

    public final void hydratingEntitiesCount(final int size) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, hydratingEntitiesCount$str(), size);
    }

    protected java.lang.String hydratingEntitiesCount$str() {
        return hydratingEntitiesCount;
    }

    public final void timestampCacheMisses(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, timestampCacheMisses$str(), updateTimestampsCachePutCount);
    }

    protected java.lang.String timestampCacheMisses$str() {
        return timestampCacheMisses;
    }

    public final void unableToObtainConnectionToQueryMetadata(final java.lang.String message) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.WARN), null, unableToObtainConnectionToQueryMetadata$str(), message);
    }

    protected java.lang.String unableToObtainConnectionToQueryMetadata$str() {
        return unableToObtainConnectionToQueryMetadata;
    }

    public final void collectionsRemoved(final long collectionRemoveCount) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, collectionsRemoved$str(), collectionRemoveCount);
    }

    protected java.lang.String collectionsRemoved$str() {
        return collectionsRemoved;
    }

    public final void exceptionHeaderFound(final java.lang.String exceptionHeader, final java.lang.String metaInfOrmXml) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, exceptionHeaderFound$str(), exceptionHeader, metaInfOrmXml);
    }

    protected java.lang.String exceptionHeaderFound$str() {
        return exceptionHeaderFound;
    }

}
