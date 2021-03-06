/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.corda;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.corda.CordaProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CordaProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.corda.CordaProducer target = (org.apache.camel.component.corda.CordaProducer) obj;
        switch (key) {
        case "accept_newnetwork_parameters":
        case "ACCEPT_NEWNETWORK_PARAMETERS": target.acceptNewNetworkParameters(exchange.getMessage()); return null;
        case "add_vault_transaction_note":
        case "ADD_VAULT_TRANSACTION_NOTE": target.addVaultTransactionNote(exchange.getMessage()); return null;
        case "attachment_exists":
        case "ATTACHMENT_EXISTS": target.attachmentExists(exchange.getMessage()); return null;
        case "clear_network_map_cache":
        case "CLEAR_NETWORK_MAP_CACHE": target.clearNetworkMapCache(exchange.getMessage()); return null;
        case "current_node_time":
        case "CURRENT_NODE_TIME": target.currentNodeTime(exchange.getMessage()); return null;
        case "get_protocol_version":
        case "GET_PROTOCOL_VERSION": target.getProtocolVersion(exchange.getMessage()); return null;
        case "get_vault_transaction_notes":
        case "GET_VAULT_TRANSACTION_NOTES": target.getVaultTransactionNotes(exchange.getMessage()); return null;
        case "is_flows_draining_mode_enabled":
        case "IS_FLOWS_DRAINING_MODE_ENABLED": target.isFlowsDrainingModeEnabled(exchange.getMessage()); return null;
        case "is_waiting_for_shutdown":
        case "IS_WAITING_FOR_SHUTDOWN": target.isWaitingForShutdown(exchange.getMessage()); return null;
        case "kill_flow":
        case "KILL_FLOW": target.killFlow(exchange.getMessage()); return null;
        case "network_map_snapshot":
        case "NETWORK_MAP_SNAPSHOT": target.networkMapSnapshot(exchange.getMessage()); return null;
        case "network_parameters_feed":
        case "NETWORK_PARAMETERS_FEED": target.networkParametersFeed(exchange.getMessage()); return null;
        case "node_info":
        case "NODE_INFO": target.nodeInfo(exchange.getMessage()); return null;
        case "node_info_from_party":
        case "NODE_INFO_FROM_PARTY": target.nodeInfoFromParty(exchange.getMessage()); return null;
        case "notary_identities":
        case "NOTARY_IDENTITIES": target.notaryIdentities(exchange.getMessage()); return null;
        case "notary_party_from_x500_name":
        case "NOTARY_PARTY_FROM_X500_NAME": target.notaryPartyFromX500Name(exchange.getMessage()); return null;
        case "open_attachment":
        case "OPEN_ATTACHMENT": target.openAttachment(exchange.getMessage()); return null;
        case "parties_from_key":
        case "PARTIES_FROM_KEY": target.partyFromKey(exchange.getMessage()); return null;
        case "parties_from_name":
        case "PARTIES_FROM_NAME": target.partiesFromName(exchange.getMessage()); return null;
        case "query_attachments":
        case "QUERY_ATTACHMENTS": target.queryAttachments(exchange.getMessage()); return null;
        case "refresh_network_map_cache":
        case "REFRESH_NETWORK_MAP_CACHE": target.refreshNetworkMapCache(exchange.getMessage()); return null;
        case "registered_flows":
        case "REGISTERED_FLOWS": target.registeredFlows(exchange.getMessage()); return null;
        case "set_flows_draining_mode_enabled":
        case "SET_FLOWS_DRAINING_MODE_ENABLED": target.setFlowsDrainingModeEnabled(exchange.getMessage()); return null;
        case "shutdown":
        case "SHUTDOWN": target.shutdown(exchange.getMessage()); return null;
        case "start_flow_dynamic":
        case "START_FLOW_DYNAMIC": target.startFlowDynamic(exchange.getMessage()); return null;
        case "state_machine_recorded_transaction_mapping_snapshot":
        case "STATE_MACHINE_RECORDED_TRANSACTION_MAPPING_SNAPSHOT": target.stateMachineRecordedTransactionMappingSnapshot(exchange.getMessage()); return null;
        case "state_machine_snapshot":
        case "STATE_MACHINE_SNAPSHOT": target.stateMachinesSnapshot(exchange.getMessage()); return null;
        case "terminate":
        case "TERMINATE": target.terminate(exchange.getMessage()); return null;
        case "upload_attachment":
        case "UPLOAD_ATTACHMENT": target.uploadAttachment(exchange.getMessage()); return null;
        case "upload_attachment_with_meta_data":
        case "UPLOAD_ATTACHMENT_WITH_META_DATA": target.uploadAttachmentWithMetadata(exchange.getMessage()); return null;
        case "vault_query":
        case "VAULT_QUERY": target.vaultQuery(exchange.getMessage()); return null;
        case "vault_query_by":
        case "VAULT_QUERY_BY": target.vaultQueryBy(exchange.getMessage()); return null;
        case "vault_query_by_criteria":
        case "VAULT_QUERY_BY_CRITERIA": target.vaultQueryByCriteria(exchange.getMessage()); return null;
        case "vault_query_by_with_paging_spec":
        case "VAULT_QUERY_BY_WITH_PAGING_SPEC": target.vaultQueryByWithPagingSpec(exchange.getMessage()); return null;
        case "vault_query_by_with_sorting":
        case "VAULT_QUERY_BY_WITH_SORTING": target.vaultQueryByWithSorting(exchange.getMessage()); return null;
        case "wait_until_network_ready":
        case "WAIT_UNTIL_NETWORK_READY": target.waitUntilNetworkReady(exchange.getMessage()); return null;
        case "well_known_party_from_anonymous":
        case "WELL_KNOWN_PARTY_FROM_ANONYMOUS": target.wellKnownPartyFromAnonymous(exchange.getMessage()); return null;
        case "well_known_party_from_x500_name":
        case "WELL_KNOWN_PARTY_FROM_X500_NAME": target.wellKnownPartyFromX500Name(exchange.getMessage()); return null;
        default: return null;
        }
    }

}

