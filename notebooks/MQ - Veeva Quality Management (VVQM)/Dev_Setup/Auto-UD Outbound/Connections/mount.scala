// Databricks notebook source
////////////////AutoUD Outbound Mounts//////////////////////////

// COMMAND ----------

//dbutils.fs.unmount("/mnt/mq_autoud_outbnd_stage")
//dbutils.fs.unmount("/mnt/mq_autoud_outbnd_cntrl_mdt")

// COMMAND ----------

dbutils.fs.mount(source = "wasbs://mq-veevaqualitymanagement@bdaze1imqdl01.blob.core.windows.net/Auto-UD Outbound/Stage/",
mountPoint = "/mnt/mq_autoud_outbnd_stage",
extraConfigs = Map("fs.azure.account.key.bdaze1imqdl01.blob.core.windows.net" -> dbutils.secrets.get(scope = "mq_veeva_scope", key = "Elanco-MQ-NonProd-VVQM-Secret")))

// COMMAND ----------

dbutils.fs.mount(source = "wasbs://mq-veevaqualitymanagement@bdaze1imqdl01.blob.core.windows.net/Auto-UD Outbound/Control_Metadata/",
mountPoint = "/mnt/mq_autoud_outbnd_cntrl_mdt",
extraConfigs = Map("fs.azure.account.key.bdaze1imqdl01.blob.core.windows.net" -> dbutils.secrets.get(scope = "mq_veeva_scope", key = "Elanco-MQ-NonProd-VVQM-Secret")))

// COMMAND ----------

dbutils.fs.mount(source = "wasbs://mq-veevaqualitymanagement@bdaze1imqdl01.blob.core.windows.net/Auto-UD Outbound/Curated/",
mountPoint = "/mnt/mq_autoud_outbnd_curated",
extraConfigs = Map("fs.azure.account.key.bdaze1imqdl01.blob.core.windows.net" -> dbutils.secrets.get(scope = "mq_veeva_scope", key = "Elanco-MQ-NonProd-VVQM-Secret")))