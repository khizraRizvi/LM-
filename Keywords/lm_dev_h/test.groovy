package lm_dev_h

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable

import groovy.sql.Sql



public class test {
	//Oracle DB Connection
	@Keyword
	def connectDB (String ora_connect, String ora_username, String ora_password	) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		return cnnct
	}

	// Column Count
	@Keyword
	def bo_Count(String ora_connect, String ora_username,  String ora_password, String ora_schema) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT COUNT(1) AS BO_COUNT FROM '+ora_schema+'.C_REPOS_TABLE WHERE type_ind = 1' as String
		def row_BO = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_BO
	}

	//BO Column Count
	@Keyword
	def bo_Col_Count(String ora_connect, String ora_username,  String ora_password, String ora_schema) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT count (1) as BO_COLUMN_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1' as String
		def row_BO = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_BO
	}

	//Landing Count
	@Keyword
	def ldg_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT COUNT(1) AS LDG_COUNT FROM '+ora_schema+'.C_REPOS_TABLE WHERE type_ind = 17' as String
		def row_LDG = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_LDG
	}

	//Landing Column Count
	@Keyword
	def ldg_col_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT count (1) as LDG_COLUMN_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 17' as String
		def row_LDG = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_LDG
	}

	//Stage Count
	@Keyword
	def stg_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT COUNT(1) AS STG_COUNT FROM '+ora_schema+'.C_REPOS_TABLE WHERE type_ind = 10' as String
		def row_STG = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_STG
	}

	//Stage Column Count
	@Keyword
	def stg_col_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT count (1) as STG_COLUMN_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 10 AND crc.SYS_IND = 0' as String
		def row_STG = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_STG
	}

	//Source Count
	@Keyword
	def src_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count (1) as SRC_System_Count from '+ora_schema+'.C_REPOS_SYSTEM' as String
		def row_SRC = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_SRC
	}

	//Source Trust Count
	@Keyword
	def srcTrust_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count (1) as TRUST_COLUMN_Count from '+ora_schema+'.C_REPOS_SYS_COL_TRUST' as String
		def row_TRUST = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_TRUST
	}

	//Match Path Count
	@Keyword
	def match_path_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count (1) as mtch_Path_Count  from '+ora_schema+'.C_REPOS_MATCH_PATH_COMPONENT pc left join '+ora_schema+'.C_REPOS_MATCH_PATH_COMPONENT pc1 on pc.rowid_parent_component = pc1.rowid_match_path_component join '+ora_schema+'.C_REPOS_TABLE t on t.rowid_table = PC.PARENT_ROWID_TABLE join '+ora_schema+'.C_REPOS_TABLE t1 on t1.rowid_table = PC.child_ROWID_TABLE join '+ora_schema+'.C_REPOS_TABLE t2 on t2.rowid_table = PC.MATCH_FOR_ROWID_TABLE' as String
		def row_MTCH = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_MTCH
	}

	//Match Fuzzy Count
	@Keyword
	def match_fuzzy_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = "SELECT CASE WHEN COUNT (1) = 1 THEN 1 ELSE COUNT (1) - 1 END AS MTCH_Fuzzy_Match_Key_Count FROM (SELECT DISTINCT T.DISPLAY_NAME AS Source_Table, mc.match_column_Name, mc.match_key_width_str FROM "+ora_schema+".C_REPOS_MATCH_COLUMN mc JOIN "+ora_schema+".C_REPOS_TABLE t ON MC.MATCH_FOR_ROWID_TABLE = T.ROWID_TABLE WHERE match_key_ind = 1 UNION SELECT 'N/A' AS Source_Table, 'N/A' AS match_column_Name, 'N/A' AS match_key_width_str FROM DUAL)" as String
		def row_MTCH = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_MTCH
	}

	//Match Column Count
	@Keyword
	def match_col_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = "SELECT COUNT (1) AS MTCH_Column_Count FROM "+ora_schema+".C_REPOS_MATCH_COLUMN mc join "+ora_schema+".C_REPOS_MATCH_COL_SRC mcs ON mc.ROWID_MATCH_COLUMN = MCS.ROWID_MATCH_COLUMN" as String
		def row_MTCH = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_MTCH
	}

	//BO Query Count
	@Keyword
	def BO_Query_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count(1) as BO_QUERY_COUNT from '+ora_schema+'.C_REPOS_QUERY' as String
		//SELECT count (1) as BO_QUERY_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1'
		def row_Qry = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_Qry
	}

	//BO Query Group Count
	@Keyword
	def BO_query_grp_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count(1) as BO_QUERY_COUNT from '+ora_schema+'.C_REPOS_QUERY_GROUP' as String
		//SELECT count (1) as BO_QUERY_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1'
		def row_Qry = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_Qry
	}

	//BO SQL Count
	@Keyword
	def BO_sql_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count(1) as BO_QUERY_COUNT from '+ora_schema+'.C_REPOS_QUERY_SQL' as String
		//SELECT count (1) as BO_QUERY_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1'
		def row_Qry = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_Qry
	}

	//Package Count
	@Keyword
	def package_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count(1) as BO_PACKAGE_COUNT from '+ora_schema+'.C_REPOS_PACKAGE_ATTRIBUTES' as String
		//SELECT count (1) as BO_QUERY_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1'
		def row_Qry = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_Qry
	}

	//BG Count
	@Keyword
	def BG_count(String ora_connect, String ora_schema, String ora_username, String ora_password) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'select count(1) as BO_BG_COUNT from '+ora_schema+'.c_repos_job_group' as String
		//SELECT count (1) as BO_QUERY_COUNT FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.C_REPOS_TABLE crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1'
		def row_Qry = cnnct.firstRow(str_Query)
		cnnct.close()
		return row_Qry
	}

	//BO Setting
	@Keyword
	def bo_Sttng(String ora_connect, String ora_username,  String ora_password, String ora_schema, String TABLE_NAME) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT DISPLAY_NAME, TABLE_NAME, DATA_SPACE_NAME, INDEX_SPACE_NAME, DESCRIPTION, TYPE_IND AS TABLE_TYPE, HISTORY_IND AS ENABLE_HISTORY, VERSIONING_IND AS TIMELINE, NON_CONTIGUOUS_IND, COMPLETE_STRIP_RATIO AS COMPLETE_TOKENIZE_RATIO, DISABLE_CONSTRAINT_IND, LOAD_BATCH_SIZE, MAX_ELAPSED_MATCH_MINUTES, PARALLEL_DEGREE, REQUEUE_ON_PARENT_MERGE_IND, STRIP_ON_LOAD_IND AS GENERATE_TOKEN_ON_LOAD, MATCH_FLAG_AUDIT_IND, API_LOCK_WAIT_SECONDS, BATCH_LOCK_WAIT_SECONDS, STATE_MANAGEMENT_IND, PROMOTION_AUDIT_IND as HIST_XREF_PROMOTION, LOOKUP_IND FROM '+ora_schema+'.c_repos_table WHERE type_ind = 1 AND table_name = ?' as String
		def row_BO = cnnct.firstRow(str_Query, [TABLE_NAME])
		cnnct.close()
		return row_BO
	}

	//BO Column Setting
	@Keyword
	def bo_ClmnSttng(String ora_connect, String ora_username,  String ora_password, String ora_schema, String TABLE_NAME, String COLUMN_NAME) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT crc.table_name, crc.SYS_IND, crc.display_name, crc.column_name, CRC.NULLABLE,CRC.DATA_TYPE,CRC.DATA_LENGTH,CRC.DATA_PRECISION, CRC.DATA_SCALE,CRC.DATA_DEFAULT,CRC.TRUST_IND,CRC.MULTI_VALUES_IND,CRC.VALIDATION_IND,CRC.MERGE_UPDATE_NULL_ALLOW_IND,CRC.EXTERNAL_UID_IND,CRC.PUTABLE_SYS_COL_IND FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.c_repos_table crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 1 and CRC.TABLE_NAME = ? and crc.column_name = ?' as String
		def row_BO = cnnct.firstRow(str_Query, [TABLE_NAME, COLUMN_NAME])
		cnnct.close()
		return row_BO
	}

	//Landing Setting
	@Keyword
	def ldg_Sttng(String ora_connect, String ora_username,  String ora_password, String ora_schema, String TABLE_NAME) {
		def cnnct = Sql.newInstance(ora_connect, ora_username, ora_password,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT DISPLAY_NAME, TABLE_NAME, DATA_SPACE_NAME, INDEX_SPACE_NAME, DESCRIPTION, TYPE_IND AS TABLE_TYPE, FULL_SET_LANDING_IND FROM '+ora_schema+'.c_repos_table WHERE type_ind = 17 AND table_name = ?' as String

		def row_LDG = cnnct.firstRow(str_Query, [TABLE_NAME])
		cnnct.close()
		return row_LDG
	}
	
	//Landing Column Setting
	@Keyword
	def ldg_ClmnSttng(String ora_cnnct, String ora_usr,  String ora_psswrd, String ora_schema, String TABLE_NAME, String COLUMN_NAME) {
		def cnnct = Sql.newInstance(ora_cnnct, ora_usr, ora_psswrd,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT crc.table_name, crc.SYS_IND, crc.display_name, crc.column_name, CRC.NULLABLE,CRC.DATA_TYPE,CRC.DATA_LENGTH,CRC.DATA_PRECISION, CRC.DATA_SCALE,CRC.DATA_DEFAULT,CRC.MULTI_VALUES_IND FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.c_repos_table crt ON crc.rowid_table = crt.rowid_table WHERE CRT.TYPE_IND = 17 and CRC.TABLE_NAME = ? and crc.column_name = ?' as String
		def row_LDG = cnnct.firstRow(str_Query, [TABLE_NAME, COLUMN_NAME])
		cnnct.close()
		return row_LDG
	}
	
	//Stage Setting
	@Keyword
	def stg_Sttng(String ora_cnnct, String ora_usr,  String ora_psswrd, String ora_schema, String TABLE_NAME) {
		def cnnct = Sql.newInstance(ora_cnnct, ora_usr, ora_psswrd,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT DISPLAY_NAME,TABLE_NAME,DATA_SPACE_NAME,INDEX_SPACE_NAME,DESCRIPTION,TYPE_IND AS TABLE_TYPE,SRC_ROWID_SYSTEM AS SYSTEM,INITIAL_TAKEON_IND AS PRESERVE_SRC_SYS_KEYS, TAKEON_GAP AS HIGHEST_RESERVE_KEY,TIMELINE_FILL_ON_GAP,DI_STAGING_IND AS INFORMATICA_PLATFORM_STAGING,MRS_SYNCH_IND AS SYNC_WITH_MODEL_REPOS_SRV,RAW_RETENTION_UNITS_CD,RAW_RETENTION_LENGTH,DELTA_TYPE,DELTA_ALLOW_REJECTS_IND FROM '+ora_schema+'.c_repos_table WHERE type_ind = 10 AND table_name = ?' as String

		def row_STG = cnnct.firstRow(str_Query, [TABLE_NAME])
		cnnct.close()
		return row_STG
	}
	
	//Stage Column Settings
	@Keyword
	def stg_ClmnSttng(String ora_cnnct, String ora_usr,  String ora_psswrd, String ora_schema, String TABLE_NAME, String DISPLAY_NAME) {
		def cnnct = Sql.newInstance(ora_cnnct, ora_usr, ora_psswrd,
				"oracle.jdbc.pool.OracleDataSource")
		def str_Query = 'SELECT crt.TABLE_NAME,crc.DISPLAY_NAME,crc.LU_ROWID_SYSTEM as LOOKUP_SYSTEM,CRT1.DISPLAY_NAME as LOOKUP_TABLE,crc1.DISPLAY_NAME as LOOKUP_COLUMN,crc.UPDATE_NULL_ALLOW_IND,crc.LU_ALLOW_NULL_FK_IND FROM '+ora_schema+'.C_REPOS_COLUMN crc JOIN '+ora_schema+'.c_repos_table crt ON crc.rowid_table = crt.rowid_table LEFT JOIN '+ora_schema+'.C_REPOS_COLUMN crc1 ON crc.LU_ROWID_COLUMN = crc1.rowid_COLUMN LEFT JOIN '+ora_schema+'.C_REPOS_TABLE crt1 ON crc1.rowid_table = crt1.rowid_table WHERE crc.SYS_IND = 0 AND crt.TYPE_IND = 10 and crt.TABLE_NAME = ? and crc.DISPLAY_NAME = ?' as String
		def row_STG = cnnct.firstRow(str_Query, [TABLE_NAME, DISPLAY_NAME])
		cnnct.close()
		return row_STG
	}
}




