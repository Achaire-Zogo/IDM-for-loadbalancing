package org.loadbalancer.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.loadbalancer.dsl.services.LoadBalancerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLoadBalancerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LoadBalancerSystem'", "'{'", "'description:'", "'version:'", "'}'", "'cluster'", "'loadbalancer'", "'algorithm:'", "'stickySession:'", "'server'", "'host:'", "'port:'", "'weight:'", "'maxConnections:'", "'enabled:'", "'healthCheck'", "'protocol:'", "'path:'", "'interval:'", "'timeout:'", "'healthyThreshold:'", "'unhealthyThreshold:'", "'sessionPersistence'", "'type:'", "'cookieName:'", "'ttl:'", "'scalingRule'", "'metric:'", "'scaleUpThreshold:'", "'scaleDownThreshold:'", "'minInstances:'", "'maxInstances:'", "'listener'", "'targetCluster:'", "'alert'", "'threshold:'", "'action:'", "'true'", "'false'", "'ROUND_ROBIN'", "'WEIGHTED_ROUND_ROBIN'", "'LEAST_CONNECTIONS'", "'IP_HASH'", "'RANDOM'", "'HTTP'", "'HTTPS'", "'TCP'", "'CPU_USAGE'", "'MEMORY_USAGE'", "'RESPONSE_TIME'", "'REQUEST_COUNT'", "'ERROR_RATE'", "'COOKIE'", "'IP'", "'HEADER'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLoadBalancerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLoadBalancerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLoadBalancerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLoadBalancer.g"; }



     	private LoadBalancerGrammarAccess grammarAccess;

        public InternalLoadBalancerParser(TokenStream input, LoadBalancerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LoadBalancerSystem";
       	}

       	@Override
       	protected LoadBalancerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLoadBalancerSystem"
    // InternalLoadBalancer.g:65:1: entryRuleLoadBalancerSystem returns [EObject current=null] : iv_ruleLoadBalancerSystem= ruleLoadBalancerSystem EOF ;
    public final EObject entryRuleLoadBalancerSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadBalancerSystem = null;


        try {
            // InternalLoadBalancer.g:65:59: (iv_ruleLoadBalancerSystem= ruleLoadBalancerSystem EOF )
            // InternalLoadBalancer.g:66:2: iv_ruleLoadBalancerSystem= ruleLoadBalancerSystem EOF
            {
             newCompositeNode(grammarAccess.getLoadBalancerSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadBalancerSystem=ruleLoadBalancerSystem();

            state._fsp--;

             current =iv_ruleLoadBalancerSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadBalancerSystem"


    // $ANTLR start "ruleLoadBalancerSystem"
    // InternalLoadBalancer.g:72:1: ruleLoadBalancerSystem returns [EObject current=null] : (otherlv_0= 'LoadBalancerSystem' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )? ( (lv_clusters_7_0= ruleCluster ) )+ ( (lv_listeners_8_0= ruleListener ) )+ ( (lv_alerts_9_0= ruleAlert ) )* otherlv_10= '}' ) ;
    public final EObject ruleLoadBalancerSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_version_6_0=null;
        Token otherlv_10=null;
        EObject lv_clusters_7_0 = null;

        EObject lv_listeners_8_0 = null;

        EObject lv_alerts_9_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:78:2: ( (otherlv_0= 'LoadBalancerSystem' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )? ( (lv_clusters_7_0= ruleCluster ) )+ ( (lv_listeners_8_0= ruleListener ) )+ ( (lv_alerts_9_0= ruleAlert ) )* otherlv_10= '}' ) )
            // InternalLoadBalancer.g:79:2: (otherlv_0= 'LoadBalancerSystem' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )? ( (lv_clusters_7_0= ruleCluster ) )+ ( (lv_listeners_8_0= ruleListener ) )+ ( (lv_alerts_9_0= ruleAlert ) )* otherlv_10= '}' )
            {
            // InternalLoadBalancer.g:79:2: (otherlv_0= 'LoadBalancerSystem' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )? ( (lv_clusters_7_0= ruleCluster ) )+ ( (lv_listeners_8_0= ruleListener ) )+ ( (lv_alerts_9_0= ruleAlert ) )* otherlv_10= '}' )
            // InternalLoadBalancer.g:80:3: otherlv_0= 'LoadBalancerSystem' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )? ( (lv_clusters_7_0= ruleCluster ) )+ ( (lv_listeners_8_0= ruleListener ) )+ ( (lv_alerts_9_0= ruleAlert ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadBalancerSystemAccess().getLoadBalancerSystemKeyword_0());
            		
            // InternalLoadBalancer.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLoadBalancer.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLoadBalancer.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalLoadBalancer.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoadBalancerSystemAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadBalancerSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadBalancerSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLoadBalancer.g:106:3: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLoadBalancer.g:107:4: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoadBalancerSystemAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalLoadBalancer.g:111:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalLoadBalancer.g:112:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalLoadBalancer.g:112:5: (lv_description_4_0= RULE_STRING )
                    // InternalLoadBalancer.g:113:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getLoadBalancerSystemAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadBalancerSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:130:3: (otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLoadBalancer.g:131:4: otherlv_5= 'version:' ( (lv_version_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoadBalancerSystemAccess().getVersionKeyword_4_0());
                    			
                    // InternalLoadBalancer.g:135:4: ( (lv_version_6_0= RULE_STRING ) )
                    // InternalLoadBalancer.g:136:5: (lv_version_6_0= RULE_STRING )
                    {
                    // InternalLoadBalancer.g:136:5: (lv_version_6_0= RULE_STRING )
                    // InternalLoadBalancer.g:137:6: lv_version_6_0= RULE_STRING
                    {
                    lv_version_6_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_version_6_0, grammarAccess.getLoadBalancerSystemAccess().getVersionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadBalancerSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:154:3: ( (lv_clusters_7_0= ruleCluster ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLoadBalancer.g:155:4: (lv_clusters_7_0= ruleCluster )
            	    {
            	    // InternalLoadBalancer.g:155:4: (lv_clusters_7_0= ruleCluster )
            	    // InternalLoadBalancer.g:156:5: lv_clusters_7_0= ruleCluster
            	    {

            	    					newCompositeNode(grammarAccess.getLoadBalancerSystemAccess().getClustersClusterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_clusters_7_0=ruleCluster();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoadBalancerSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clusters",
            	    						lv_clusters_7_0,
            	    						"org.loadbalancer.dsl.LoadBalancer.Cluster");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalLoadBalancer.g:173:3: ( (lv_listeners_8_0= ruleListener ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLoadBalancer.g:174:4: (lv_listeners_8_0= ruleListener )
            	    {
            	    // InternalLoadBalancer.g:174:4: (lv_listeners_8_0= ruleListener )
            	    // InternalLoadBalancer.g:175:5: lv_listeners_8_0= ruleListener
            	    {

            	    					newCompositeNode(grammarAccess.getLoadBalancerSystemAccess().getListenersListenerParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_listeners_8_0=ruleListener();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoadBalancerSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listeners",
            	    						lv_listeners_8_0,
            	    						"org.loadbalancer.dsl.LoadBalancer.Listener");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalLoadBalancer.g:192:3: ( (lv_alerts_9_0= ruleAlert ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLoadBalancer.g:193:4: (lv_alerts_9_0= ruleAlert )
            	    {
            	    // InternalLoadBalancer.g:193:4: (lv_alerts_9_0= ruleAlert )
            	    // InternalLoadBalancer.g:194:5: lv_alerts_9_0= ruleAlert
            	    {

            	    					newCompositeNode(grammarAccess.getLoadBalancerSystemAccess().getAlertsAlertParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_alerts_9_0=ruleAlert();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoadBalancerSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alerts",
            	    						lv_alerts_9_0,
            	    						"org.loadbalancer.dsl.LoadBalancer.Alert");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoadBalancerSystemAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadBalancerSystem"


    // $ANTLR start "entryRuleCluster"
    // InternalLoadBalancer.g:219:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalLoadBalancer.g:219:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalLoadBalancer.g:220:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // InternalLoadBalancer.g:226:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) ) ( (lv_servers_4_0= ruleServer ) )+ ( (lv_healthCheck_5_0= ruleHealthCheck ) )? ( (lv_scalingRule_6_0= ruleScalingRule ) )? otherlv_7= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_loadBalancer_3_0 = null;

        EObject lv_servers_4_0 = null;

        EObject lv_healthCheck_5_0 = null;

        EObject lv_scalingRule_6_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:232:2: ( (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) ) ( (lv_servers_4_0= ruleServer ) )+ ( (lv_healthCheck_5_0= ruleHealthCheck ) )? ( (lv_scalingRule_6_0= ruleScalingRule ) )? otherlv_7= '}' ) )
            // InternalLoadBalancer.g:233:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) ) ( (lv_servers_4_0= ruleServer ) )+ ( (lv_healthCheck_5_0= ruleHealthCheck ) )? ( (lv_scalingRule_6_0= ruleScalingRule ) )? otherlv_7= '}' )
            {
            // InternalLoadBalancer.g:233:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) ) ( (lv_servers_4_0= ruleServer ) )+ ( (lv_healthCheck_5_0= ruleHealthCheck ) )? ( (lv_scalingRule_6_0= ruleScalingRule ) )? otherlv_7= '}' )
            // InternalLoadBalancer.g:234:3: otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) ) ( (lv_servers_4_0= ruleServer ) )+ ( (lv_healthCheck_5_0= ruleHealthCheck ) )? ( (lv_scalingRule_6_0= ruleScalingRule ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getClusterKeyword_0());
            		
            // InternalLoadBalancer.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLoadBalancer.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLoadBalancer.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalLoadBalancer.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClusterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClusterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLoadBalancer.g:260:3: ( (lv_loadBalancer_3_0= ruleLoadBalancerConfig ) )
            // InternalLoadBalancer.g:261:4: (lv_loadBalancer_3_0= ruleLoadBalancerConfig )
            {
            // InternalLoadBalancer.g:261:4: (lv_loadBalancer_3_0= ruleLoadBalancerConfig )
            // InternalLoadBalancer.g:262:5: lv_loadBalancer_3_0= ruleLoadBalancerConfig
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getLoadBalancerLoadBalancerConfigParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_loadBalancer_3_0=ruleLoadBalancerConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterRule());
            					}
            					set(
            						current,
            						"loadBalancer",
            						lv_loadBalancer_3_0,
            						"org.loadbalancer.dsl.LoadBalancer.LoadBalancerConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLoadBalancer.g:279:3: ( (lv_servers_4_0= ruleServer ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLoadBalancer.g:280:4: (lv_servers_4_0= ruleServer )
            	    {
            	    // InternalLoadBalancer.g:280:4: (lv_servers_4_0= ruleServer )
            	    // InternalLoadBalancer.g:281:5: lv_servers_4_0= ruleServer
            	    {

            	    					newCompositeNode(grammarAccess.getClusterAccess().getServersServerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_servers_4_0=ruleServer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClusterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servers",
            	    						lv_servers_4_0,
            	    						"org.loadbalancer.dsl.LoadBalancer.Server");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalLoadBalancer.g:298:3: ( (lv_healthCheck_5_0= ruleHealthCheck ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLoadBalancer.g:299:4: (lv_healthCheck_5_0= ruleHealthCheck )
                    {
                    // InternalLoadBalancer.g:299:4: (lv_healthCheck_5_0= ruleHealthCheck )
                    // InternalLoadBalancer.g:300:5: lv_healthCheck_5_0= ruleHealthCheck
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getHealthCheckHealthCheckParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_healthCheck_5_0=ruleHealthCheck();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"healthCheck",
                    						lv_healthCheck_5_0,
                    						"org.loadbalancer.dsl.LoadBalancer.HealthCheck");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:317:3: ( (lv_scalingRule_6_0= ruleScalingRule ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLoadBalancer.g:318:4: (lv_scalingRule_6_0= ruleScalingRule )
                    {
                    // InternalLoadBalancer.g:318:4: (lv_scalingRule_6_0= ruleScalingRule )
                    // InternalLoadBalancer.g:319:5: lv_scalingRule_6_0= ruleScalingRule
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getScalingRuleScalingRuleParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_scalingRule_6_0=ruleScalingRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"scalingRule",
                    						lv_scalingRule_6_0,
                    						"org.loadbalancer.dsl.LoadBalancer.ScalingRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleLoadBalancerConfig"
    // InternalLoadBalancer.g:344:1: entryRuleLoadBalancerConfig returns [EObject current=null] : iv_ruleLoadBalancerConfig= ruleLoadBalancerConfig EOF ;
    public final EObject entryRuleLoadBalancerConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadBalancerConfig = null;


        try {
            // InternalLoadBalancer.g:344:59: (iv_ruleLoadBalancerConfig= ruleLoadBalancerConfig EOF )
            // InternalLoadBalancer.g:345:2: iv_ruleLoadBalancerConfig= ruleLoadBalancerConfig EOF
            {
             newCompositeNode(grammarAccess.getLoadBalancerConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadBalancerConfig=ruleLoadBalancerConfig();

            state._fsp--;

             current =iv_ruleLoadBalancerConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadBalancerConfig"


    // $ANTLR start "ruleLoadBalancerConfig"
    // InternalLoadBalancer.g:351:1: ruleLoadBalancerConfig returns [EObject current=null] : (otherlv_0= 'loadbalancer' otherlv_1= '{' otherlv_2= 'algorithm:' ( (lv_algorithm_3_0= ruleAlgorithm ) ) otherlv_4= 'stickySession:' ( (lv_stickySession_5_0= ruleBooleanValue ) ) ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )? otherlv_7= '}' ) ;
    public final EObject ruleLoadBalancerConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_algorithm_3_0 = null;

        EObject lv_stickySession_5_0 = null;

        EObject lv_sessionPersistence_6_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:357:2: ( (otherlv_0= 'loadbalancer' otherlv_1= '{' otherlv_2= 'algorithm:' ( (lv_algorithm_3_0= ruleAlgorithm ) ) otherlv_4= 'stickySession:' ( (lv_stickySession_5_0= ruleBooleanValue ) ) ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )? otherlv_7= '}' ) )
            // InternalLoadBalancer.g:358:2: (otherlv_0= 'loadbalancer' otherlv_1= '{' otherlv_2= 'algorithm:' ( (lv_algorithm_3_0= ruleAlgorithm ) ) otherlv_4= 'stickySession:' ( (lv_stickySession_5_0= ruleBooleanValue ) ) ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )? otherlv_7= '}' )
            {
            // InternalLoadBalancer.g:358:2: (otherlv_0= 'loadbalancer' otherlv_1= '{' otherlv_2= 'algorithm:' ( (lv_algorithm_3_0= ruleAlgorithm ) ) otherlv_4= 'stickySession:' ( (lv_stickySession_5_0= ruleBooleanValue ) ) ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )? otherlv_7= '}' )
            // InternalLoadBalancer.g:359:3: otherlv_0= 'loadbalancer' otherlv_1= '{' otherlv_2= 'algorithm:' ( (lv_algorithm_3_0= ruleAlgorithm ) ) otherlv_4= 'stickySession:' ( (lv_stickySession_5_0= ruleBooleanValue ) ) ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadBalancerConfigAccess().getLoadbalancerKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadBalancerConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadBalancerConfigAccess().getAlgorithmKeyword_2());
            		
            // InternalLoadBalancer.g:371:3: ( (lv_algorithm_3_0= ruleAlgorithm ) )
            // InternalLoadBalancer.g:372:4: (lv_algorithm_3_0= ruleAlgorithm )
            {
            // InternalLoadBalancer.g:372:4: (lv_algorithm_3_0= ruleAlgorithm )
            // InternalLoadBalancer.g:373:5: lv_algorithm_3_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getLoadBalancerConfigAccess().getAlgorithmAlgorithmEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_algorithm_3_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadBalancerConfigRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_3_0,
            						"org.loadbalancer.dsl.LoadBalancer.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadBalancerConfigAccess().getStickySessionKeyword_4());
            		
            // InternalLoadBalancer.g:394:3: ( (lv_stickySession_5_0= ruleBooleanValue ) )
            // InternalLoadBalancer.g:395:4: (lv_stickySession_5_0= ruleBooleanValue )
            {
            // InternalLoadBalancer.g:395:4: (lv_stickySession_5_0= ruleBooleanValue )
            // InternalLoadBalancer.g:396:5: lv_stickySession_5_0= ruleBooleanValue
            {

            					newCompositeNode(grammarAccess.getLoadBalancerConfigAccess().getStickySessionBooleanValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_stickySession_5_0=ruleBooleanValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadBalancerConfigRule());
            					}
            					set(
            						current,
            						"stickySession",
            						lv_stickySession_5_0,
            						"org.loadbalancer.dsl.LoadBalancer.BooleanValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLoadBalancer.g:413:3: ( (lv_sessionPersistence_6_0= ruleSessionPersistence ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLoadBalancer.g:414:4: (lv_sessionPersistence_6_0= ruleSessionPersistence )
                    {
                    // InternalLoadBalancer.g:414:4: (lv_sessionPersistence_6_0= ruleSessionPersistence )
                    // InternalLoadBalancer.g:415:5: lv_sessionPersistence_6_0= ruleSessionPersistence
                    {

                    					newCompositeNode(grammarAccess.getLoadBalancerConfigAccess().getSessionPersistenceSessionPersistenceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_sessionPersistence_6_0=ruleSessionPersistence();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLoadBalancerConfigRule());
                    					}
                    					set(
                    						current,
                    						"sessionPersistence",
                    						lv_sessionPersistence_6_0,
                    						"org.loadbalancer.dsl.LoadBalancer.SessionPersistence");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadBalancerConfigAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadBalancerConfig"


    // $ANTLR start "entryRuleServer"
    // InternalLoadBalancer.g:440:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalLoadBalancer.g:440:47: (iv_ruleServer= ruleServer EOF )
            // InternalLoadBalancer.g:441:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalLoadBalancer.g:447:1: ruleServer returns [EObject current=null] : (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'host:' ( (lv_host_4_0= RULE_STRING ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )? (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )? otherlv_11= 'enabled:' ( (lv_enabled_12_0= ruleBooleanValue ) ) otherlv_13= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_host_4_0=null;
        Token otherlv_5=null;
        Token lv_port_6_0=null;
        Token otherlv_7=null;
        Token lv_weight_8_0=null;
        Token otherlv_9=null;
        Token lv_maxConnections_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_enabled_12_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:453:2: ( (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'host:' ( (lv_host_4_0= RULE_STRING ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )? (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )? otherlv_11= 'enabled:' ( (lv_enabled_12_0= ruleBooleanValue ) ) otherlv_13= '}' ) )
            // InternalLoadBalancer.g:454:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'host:' ( (lv_host_4_0= RULE_STRING ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )? (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )? otherlv_11= 'enabled:' ( (lv_enabled_12_0= ruleBooleanValue ) ) otherlv_13= '}' )
            {
            // InternalLoadBalancer.g:454:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'host:' ( (lv_host_4_0= RULE_STRING ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )? (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )? otherlv_11= 'enabled:' ( (lv_enabled_12_0= ruleBooleanValue ) ) otherlv_13= '}' )
            // InternalLoadBalancer.g:455:3: otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'host:' ( (lv_host_4_0= RULE_STRING ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )? (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )? otherlv_11= 'enabled:' ( (lv_enabled_12_0= ruleBooleanValue ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
            		
            // InternalLoadBalancer.g:459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLoadBalancer.g:460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLoadBalancer.g:460:4: (lv_name_1_0= RULE_ID )
            // InternalLoadBalancer.g:461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getHostKeyword_3());
            		
            // InternalLoadBalancer.g:485:3: ( (lv_host_4_0= RULE_STRING ) )
            // InternalLoadBalancer.g:486:4: (lv_host_4_0= RULE_STRING )
            {
            // InternalLoadBalancer.g:486:4: (lv_host_4_0= RULE_STRING )
            // InternalLoadBalancer.g:487:5: lv_host_4_0= RULE_STRING
            {
            lv_host_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_host_4_0, grammarAccess.getServerAccess().getHostSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getServerAccess().getPortKeyword_5());
            		
            // InternalLoadBalancer.g:507:3: ( (lv_port_6_0= RULE_INT ) )
            // InternalLoadBalancer.g:508:4: (lv_port_6_0= RULE_INT )
            {
            // InternalLoadBalancer.g:508:4: (lv_port_6_0= RULE_INT )
            // InternalLoadBalancer.g:509:5: lv_port_6_0= RULE_INT
            {
            lv_port_6_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_port_6_0, grammarAccess.getServerAccess().getPortINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalLoadBalancer.g:525:3: (otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLoadBalancer.g:526:4: otherlv_7= 'weight:' ( (lv_weight_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getServerAccess().getWeightKeyword_7_0());
                    			
                    // InternalLoadBalancer.g:530:4: ( (lv_weight_8_0= RULE_INT ) )
                    // InternalLoadBalancer.g:531:5: (lv_weight_8_0= RULE_INT )
                    {
                    // InternalLoadBalancer.g:531:5: (lv_weight_8_0= RULE_INT )
                    // InternalLoadBalancer.g:532:6: lv_weight_8_0= RULE_INT
                    {
                    lv_weight_8_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_weight_8_0, grammarAccess.getServerAccess().getWeightINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"weight",
                    							lv_weight_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:549:3: (otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLoadBalancer.g:550:4: otherlv_9= 'maxConnections:' ( (lv_maxConnections_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getServerAccess().getMaxConnectionsKeyword_8_0());
                    			
                    // InternalLoadBalancer.g:554:4: ( (lv_maxConnections_10_0= RULE_INT ) )
                    // InternalLoadBalancer.g:555:5: (lv_maxConnections_10_0= RULE_INT )
                    {
                    // InternalLoadBalancer.g:555:5: (lv_maxConnections_10_0= RULE_INT )
                    // InternalLoadBalancer.g:556:6: lv_maxConnections_10_0= RULE_INT
                    {
                    lv_maxConnections_10_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_maxConnections_10_0, grammarAccess.getServerAccess().getMaxConnectionsINTTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxConnections",
                    							lv_maxConnections_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getServerAccess().getEnabledKeyword_9());
            		
            // InternalLoadBalancer.g:577:3: ( (lv_enabled_12_0= ruleBooleanValue ) )
            // InternalLoadBalancer.g:578:4: (lv_enabled_12_0= ruleBooleanValue )
            {
            // InternalLoadBalancer.g:578:4: (lv_enabled_12_0= ruleBooleanValue )
            // InternalLoadBalancer.g:579:5: lv_enabled_12_0= ruleBooleanValue
            {

            					newCompositeNode(grammarAccess.getServerAccess().getEnabledBooleanValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_enabled_12_0=ruleBooleanValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"enabled",
            						lv_enabled_12_0,
            						"org.loadbalancer.dsl.LoadBalancer.BooleanValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleHealthCheck"
    // InternalLoadBalancer.g:604:1: entryRuleHealthCheck returns [EObject current=null] : iv_ruleHealthCheck= ruleHealthCheck EOF ;
    public final EObject entryRuleHealthCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthCheck = null;


        try {
            // InternalLoadBalancer.g:604:52: (iv_ruleHealthCheck= ruleHealthCheck EOF )
            // InternalLoadBalancer.g:605:2: iv_ruleHealthCheck= ruleHealthCheck EOF
            {
             newCompositeNode(grammarAccess.getHealthCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthCheck=ruleHealthCheck();

            state._fsp--;

             current =iv_ruleHealthCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHealthCheck"


    // $ANTLR start "ruleHealthCheck"
    // InternalLoadBalancer.g:611:1: ruleHealthCheck returns [EObject current=null] : (otherlv_0= 'healthCheck' otherlv_1= '{' otherlv_2= 'protocol:' ( (lv_protocol_3_0= ruleProtocol ) ) otherlv_4= 'path:' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'interval:' ( (lv_interval_7_0= RULE_INT ) ) otherlv_8= 'timeout:' ( (lv_timeout_9_0= RULE_INT ) ) (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )? (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleHealthCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token lv_interval_7_0=null;
        Token otherlv_8=null;
        Token lv_timeout_9_0=null;
        Token otherlv_10=null;
        Token lv_healthyThreshold_11_0=null;
        Token otherlv_12=null;
        Token lv_unhealthyThreshold_13_0=null;
        Token otherlv_14=null;
        Enumerator lv_protocol_3_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:617:2: ( (otherlv_0= 'healthCheck' otherlv_1= '{' otherlv_2= 'protocol:' ( (lv_protocol_3_0= ruleProtocol ) ) otherlv_4= 'path:' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'interval:' ( (lv_interval_7_0= RULE_INT ) ) otherlv_8= 'timeout:' ( (lv_timeout_9_0= RULE_INT ) ) (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )? (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )? otherlv_14= '}' ) )
            // InternalLoadBalancer.g:618:2: (otherlv_0= 'healthCheck' otherlv_1= '{' otherlv_2= 'protocol:' ( (lv_protocol_3_0= ruleProtocol ) ) otherlv_4= 'path:' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'interval:' ( (lv_interval_7_0= RULE_INT ) ) otherlv_8= 'timeout:' ( (lv_timeout_9_0= RULE_INT ) ) (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )? (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )? otherlv_14= '}' )
            {
            // InternalLoadBalancer.g:618:2: (otherlv_0= 'healthCheck' otherlv_1= '{' otherlv_2= 'protocol:' ( (lv_protocol_3_0= ruleProtocol ) ) otherlv_4= 'path:' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'interval:' ( (lv_interval_7_0= RULE_INT ) ) otherlv_8= 'timeout:' ( (lv_timeout_9_0= RULE_INT ) ) (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )? (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )? otherlv_14= '}' )
            // InternalLoadBalancer.g:619:3: otherlv_0= 'healthCheck' otherlv_1= '{' otherlv_2= 'protocol:' ( (lv_protocol_3_0= ruleProtocol ) ) otherlv_4= 'path:' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'interval:' ( (lv_interval_7_0= RULE_INT ) ) otherlv_8= 'timeout:' ( (lv_timeout_9_0= RULE_INT ) ) (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )? (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHealthCheckAccess().getHealthCheckKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthCheckAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getHealthCheckAccess().getProtocolKeyword_2());
            		
            // InternalLoadBalancer.g:631:3: ( (lv_protocol_3_0= ruleProtocol ) )
            // InternalLoadBalancer.g:632:4: (lv_protocol_3_0= ruleProtocol )
            {
            // InternalLoadBalancer.g:632:4: (lv_protocol_3_0= ruleProtocol )
            // InternalLoadBalancer.g:633:5: lv_protocol_3_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getHealthCheckAccess().getProtocolProtocolEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_protocol_3_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHealthCheckRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_3_0,
            						"org.loadbalancer.dsl.LoadBalancer.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getHealthCheckAccess().getPathKeyword_4());
            		
            // InternalLoadBalancer.g:654:3: ( (lv_path_5_0= RULE_STRING ) )
            // InternalLoadBalancer.g:655:4: (lv_path_5_0= RULE_STRING )
            {
            // InternalLoadBalancer.g:655:4: (lv_path_5_0= RULE_STRING )
            // InternalLoadBalancer.g:656:5: lv_path_5_0= RULE_STRING
            {
            lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_path_5_0, grammarAccess.getHealthCheckAccess().getPathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getHealthCheckAccess().getIntervalKeyword_6());
            		
            // InternalLoadBalancer.g:676:3: ( (lv_interval_7_0= RULE_INT ) )
            // InternalLoadBalancer.g:677:4: (lv_interval_7_0= RULE_INT )
            {
            // InternalLoadBalancer.g:677:4: (lv_interval_7_0= RULE_INT )
            // InternalLoadBalancer.g:678:5: lv_interval_7_0= RULE_INT
            {
            lv_interval_7_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_interval_7_0, grammarAccess.getHealthCheckAccess().getIntervalINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getHealthCheckAccess().getTimeoutKeyword_8());
            		
            // InternalLoadBalancer.g:698:3: ( (lv_timeout_9_0= RULE_INT ) )
            // InternalLoadBalancer.g:699:4: (lv_timeout_9_0= RULE_INT )
            {
            // InternalLoadBalancer.g:699:4: (lv_timeout_9_0= RULE_INT )
            // InternalLoadBalancer.g:700:5: lv_timeout_9_0= RULE_INT
            {
            lv_timeout_9_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_timeout_9_0, grammarAccess.getHealthCheckAccess().getTimeoutINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeout",
            						lv_timeout_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalLoadBalancer.g:716:3: (otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLoadBalancer.g:717:4: otherlv_10= 'healthyThreshold:' ( (lv_healthyThreshold_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getHealthCheckAccess().getHealthyThresholdKeyword_10_0());
                    			
                    // InternalLoadBalancer.g:721:4: ( (lv_healthyThreshold_11_0= RULE_INT ) )
                    // InternalLoadBalancer.g:722:5: (lv_healthyThreshold_11_0= RULE_INT )
                    {
                    // InternalLoadBalancer.g:722:5: (lv_healthyThreshold_11_0= RULE_INT )
                    // InternalLoadBalancer.g:723:6: lv_healthyThreshold_11_0= RULE_INT
                    {
                    lv_healthyThreshold_11_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_healthyThreshold_11_0, grammarAccess.getHealthCheckAccess().getHealthyThresholdINTTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHealthCheckRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"healthyThreshold",
                    							lv_healthyThreshold_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:740:3: (otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLoadBalancer.g:741:4: otherlv_12= 'unhealthyThreshold:' ( (lv_unhealthyThreshold_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getHealthCheckAccess().getUnhealthyThresholdKeyword_11_0());
                    			
                    // InternalLoadBalancer.g:745:4: ( (lv_unhealthyThreshold_13_0= RULE_INT ) )
                    // InternalLoadBalancer.g:746:5: (lv_unhealthyThreshold_13_0= RULE_INT )
                    {
                    // InternalLoadBalancer.g:746:5: (lv_unhealthyThreshold_13_0= RULE_INT )
                    // InternalLoadBalancer.g:747:6: lv_unhealthyThreshold_13_0= RULE_INT
                    {
                    lv_unhealthyThreshold_13_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_unhealthyThreshold_13_0, grammarAccess.getHealthCheckAccess().getUnhealthyThresholdINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHealthCheckRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"unhealthyThreshold",
                    							lv_unhealthyThreshold_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getHealthCheckAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHealthCheck"


    // $ANTLR start "entryRuleSessionPersistence"
    // InternalLoadBalancer.g:772:1: entryRuleSessionPersistence returns [EObject current=null] : iv_ruleSessionPersistence= ruleSessionPersistence EOF ;
    public final EObject entryRuleSessionPersistence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionPersistence = null;


        try {
            // InternalLoadBalancer.g:772:59: (iv_ruleSessionPersistence= ruleSessionPersistence EOF )
            // InternalLoadBalancer.g:773:2: iv_ruleSessionPersistence= ruleSessionPersistence EOF
            {
             newCompositeNode(grammarAccess.getSessionPersistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSessionPersistence=ruleSessionPersistence();

            state._fsp--;

             current =iv_ruleSessionPersistence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSessionPersistence"


    // $ANTLR start "ruleSessionPersistence"
    // InternalLoadBalancer.g:779:1: ruleSessionPersistence returns [EObject current=null] : (otherlv_0= 'sessionPersistence' otherlv_1= '{' otherlv_2= 'type:' ( (lv_type_3_0= rulePersistenceType ) ) (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )? (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSessionPersistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_cookieName_5_0=null;
        Token otherlv_6=null;
        Token lv_ttl_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:785:2: ( (otherlv_0= 'sessionPersistence' otherlv_1= '{' otherlv_2= 'type:' ( (lv_type_3_0= rulePersistenceType ) ) (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )? (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // InternalLoadBalancer.g:786:2: (otherlv_0= 'sessionPersistence' otherlv_1= '{' otherlv_2= 'type:' ( (lv_type_3_0= rulePersistenceType ) ) (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )? (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // InternalLoadBalancer.g:786:2: (otherlv_0= 'sessionPersistence' otherlv_1= '{' otherlv_2= 'type:' ( (lv_type_3_0= rulePersistenceType ) ) (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )? (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // InternalLoadBalancer.g:787:3: otherlv_0= 'sessionPersistence' otherlv_1= '{' otherlv_2= 'type:' ( (lv_type_3_0= rulePersistenceType ) ) (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )? (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionPersistenceAccess().getSessionPersistenceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionPersistenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionPersistenceAccess().getTypeKeyword_2());
            		
            // InternalLoadBalancer.g:799:3: ( (lv_type_3_0= rulePersistenceType ) )
            // InternalLoadBalancer.g:800:4: (lv_type_3_0= rulePersistenceType )
            {
            // InternalLoadBalancer.g:800:4: (lv_type_3_0= rulePersistenceType )
            // InternalLoadBalancer.g:801:5: lv_type_3_0= rulePersistenceType
            {

            					newCompositeNode(grammarAccess.getSessionPersistenceAccess().getTypePersistenceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_type_3_0=rulePersistenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionPersistenceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.loadbalancer.dsl.LoadBalancer.PersistenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLoadBalancer.g:818:3: (otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLoadBalancer.g:819:4: otherlv_4= 'cookieName:' ( (lv_cookieName_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSessionPersistenceAccess().getCookieNameKeyword_4_0());
                    			
                    // InternalLoadBalancer.g:823:4: ( (lv_cookieName_5_0= RULE_STRING ) )
                    // InternalLoadBalancer.g:824:5: (lv_cookieName_5_0= RULE_STRING )
                    {
                    // InternalLoadBalancer.g:824:5: (lv_cookieName_5_0= RULE_STRING )
                    // InternalLoadBalancer.g:825:6: lv_cookieName_5_0= RULE_STRING
                    {
                    lv_cookieName_5_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_cookieName_5_0, grammarAccess.getSessionPersistenceAccess().getCookieNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionPersistenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"cookieName",
                    							lv_cookieName_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLoadBalancer.g:842:3: (otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLoadBalancer.g:843:4: otherlv_6= 'ttl:' ( (lv_ttl_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getSessionPersistenceAccess().getTtlKeyword_5_0());
                    			
                    // InternalLoadBalancer.g:847:4: ( (lv_ttl_7_0= RULE_INT ) )
                    // InternalLoadBalancer.g:848:5: (lv_ttl_7_0= RULE_INT )
                    {
                    // InternalLoadBalancer.g:848:5: (lv_ttl_7_0= RULE_INT )
                    // InternalLoadBalancer.g:849:6: lv_ttl_7_0= RULE_INT
                    {
                    lv_ttl_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_ttl_7_0, grammarAccess.getSessionPersistenceAccess().getTtlINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionPersistenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ttl",
                    							lv_ttl_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSessionPersistenceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSessionPersistence"


    // $ANTLR start "entryRuleScalingRule"
    // InternalLoadBalancer.g:874:1: entryRuleScalingRule returns [EObject current=null] : iv_ruleScalingRule= ruleScalingRule EOF ;
    public final EObject entryRuleScalingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalingRule = null;


        try {
            // InternalLoadBalancer.g:874:52: (iv_ruleScalingRule= ruleScalingRule EOF )
            // InternalLoadBalancer.g:875:2: iv_ruleScalingRule= ruleScalingRule EOF
            {
             newCompositeNode(grammarAccess.getScalingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalingRule=ruleScalingRule();

            state._fsp--;

             current =iv_ruleScalingRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalingRule"


    // $ANTLR start "ruleScalingRule"
    // InternalLoadBalancer.g:881:1: ruleScalingRule returns [EObject current=null] : (otherlv_0= 'scalingRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'scaleUpThreshold:' ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'scaleDownThreshold:' ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) ) otherlv_9= 'minInstances:' ( (lv_minInstances_10_0= RULE_INT ) ) otherlv_11= 'maxInstances:' ( (lv_maxInstances_12_0= RULE_INT ) ) otherlv_13= '}' ) ;
    public final EObject ruleScalingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_scaleUpThreshold_6_0=null;
        Token otherlv_7=null;
        Token lv_scaleDownThreshold_8_0=null;
        Token otherlv_9=null;
        Token lv_minInstances_10_0=null;
        Token otherlv_11=null;
        Token lv_maxInstances_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_metric_4_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:887:2: ( (otherlv_0= 'scalingRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'scaleUpThreshold:' ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'scaleDownThreshold:' ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) ) otherlv_9= 'minInstances:' ( (lv_minInstances_10_0= RULE_INT ) ) otherlv_11= 'maxInstances:' ( (lv_maxInstances_12_0= RULE_INT ) ) otherlv_13= '}' ) )
            // InternalLoadBalancer.g:888:2: (otherlv_0= 'scalingRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'scaleUpThreshold:' ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'scaleDownThreshold:' ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) ) otherlv_9= 'minInstances:' ( (lv_minInstances_10_0= RULE_INT ) ) otherlv_11= 'maxInstances:' ( (lv_maxInstances_12_0= RULE_INT ) ) otherlv_13= '}' )
            {
            // InternalLoadBalancer.g:888:2: (otherlv_0= 'scalingRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'scaleUpThreshold:' ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'scaleDownThreshold:' ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) ) otherlv_9= 'minInstances:' ( (lv_minInstances_10_0= RULE_INT ) ) otherlv_11= 'maxInstances:' ( (lv_maxInstances_12_0= RULE_INT ) ) otherlv_13= '}' )
            // InternalLoadBalancer.g:889:3: otherlv_0= 'scalingRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'scaleUpThreshold:' ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'scaleDownThreshold:' ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) ) otherlv_9= 'minInstances:' ( (lv_minInstances_10_0= RULE_INT ) ) otherlv_11= 'maxInstances:' ( (lv_maxInstances_12_0= RULE_INT ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getScalingRuleAccess().getScalingRuleKeyword_0());
            		
            // InternalLoadBalancer.g:893:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLoadBalancer.g:894:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLoadBalancer.g:894:4: (lv_name_1_0= RULE_ID )
            // InternalLoadBalancer.g:895:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalingRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalingRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getScalingRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getScalingRuleAccess().getMetricKeyword_3());
            		
            // InternalLoadBalancer.g:919:3: ( (lv_metric_4_0= ruleMetric ) )
            // InternalLoadBalancer.g:920:4: (lv_metric_4_0= ruleMetric )
            {
            // InternalLoadBalancer.g:920:4: (lv_metric_4_0= ruleMetric )
            // InternalLoadBalancer.g:921:5: lv_metric_4_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getScalingRuleAccess().getMetricMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_metric_4_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalingRuleRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_4_0,
            						"org.loadbalancer.dsl.LoadBalancer.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getScalingRuleAccess().getScaleUpThresholdKeyword_5());
            		
            // InternalLoadBalancer.g:942:3: ( (lv_scaleUpThreshold_6_0= RULE_DOUBLE ) )
            // InternalLoadBalancer.g:943:4: (lv_scaleUpThreshold_6_0= RULE_DOUBLE )
            {
            // InternalLoadBalancer.g:943:4: (lv_scaleUpThreshold_6_0= RULE_DOUBLE )
            // InternalLoadBalancer.g:944:5: lv_scaleUpThreshold_6_0= RULE_DOUBLE
            {
            lv_scaleUpThreshold_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_41); 

            					newLeafNode(lv_scaleUpThreshold_6_0, grammarAccess.getScalingRuleAccess().getScaleUpThresholdDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalingRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scaleUpThreshold",
            						lv_scaleUpThreshold_6_0,
            						"org.loadbalancer.dsl.LoadBalancer.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_7, grammarAccess.getScalingRuleAccess().getScaleDownThresholdKeyword_7());
            		
            // InternalLoadBalancer.g:964:3: ( (lv_scaleDownThreshold_8_0= RULE_DOUBLE ) )
            // InternalLoadBalancer.g:965:4: (lv_scaleDownThreshold_8_0= RULE_DOUBLE )
            {
            // InternalLoadBalancer.g:965:4: (lv_scaleDownThreshold_8_0= RULE_DOUBLE )
            // InternalLoadBalancer.g:966:5: lv_scaleDownThreshold_8_0= RULE_DOUBLE
            {
            lv_scaleDownThreshold_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_42); 

            					newLeafNode(lv_scaleDownThreshold_8_0, grammarAccess.getScalingRuleAccess().getScaleDownThresholdDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalingRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scaleDownThreshold",
            						lv_scaleDownThreshold_8_0,
            						"org.loadbalancer.dsl.LoadBalancer.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getScalingRuleAccess().getMinInstancesKeyword_9());
            		
            // InternalLoadBalancer.g:986:3: ( (lv_minInstances_10_0= RULE_INT ) )
            // InternalLoadBalancer.g:987:4: (lv_minInstances_10_0= RULE_INT )
            {
            // InternalLoadBalancer.g:987:4: (lv_minInstances_10_0= RULE_INT )
            // InternalLoadBalancer.g:988:5: lv_minInstances_10_0= RULE_INT
            {
            lv_minInstances_10_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_minInstances_10_0, grammarAccess.getScalingRuleAccess().getMinInstancesINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalingRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minInstances",
            						lv_minInstances_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_11, grammarAccess.getScalingRuleAccess().getMaxInstancesKeyword_11());
            		
            // InternalLoadBalancer.g:1008:3: ( (lv_maxInstances_12_0= RULE_INT ) )
            // InternalLoadBalancer.g:1009:4: (lv_maxInstances_12_0= RULE_INT )
            {
            // InternalLoadBalancer.g:1009:4: (lv_maxInstances_12_0= RULE_INT )
            // InternalLoadBalancer.g:1010:5: lv_maxInstances_12_0= RULE_INT
            {
            lv_maxInstances_12_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_maxInstances_12_0, grammarAccess.getScalingRuleAccess().getMaxInstancesINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalingRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxInstances",
            						lv_maxInstances_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getScalingRuleAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalingRule"


    // $ANTLR start "entryRuleListener"
    // InternalLoadBalancer.g:1034:1: entryRuleListener returns [EObject current=null] : iv_ruleListener= ruleListener EOF ;
    public final EObject entryRuleListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListener = null;


        try {
            // InternalLoadBalancer.g:1034:49: (iv_ruleListener= ruleListener EOF )
            // InternalLoadBalancer.g:1035:2: iv_ruleListener= ruleListener EOF
            {
             newCompositeNode(grammarAccess.getListenerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListener=ruleListener();

            state._fsp--;

             current =iv_ruleListener; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListener"


    // $ANTLR start "ruleListener"
    // InternalLoadBalancer.g:1041:1: ruleListener returns [EObject current=null] : (otherlv_0= 'listener' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'protocol:' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) otherlv_7= 'targetCluster:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleListener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_port_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_protocol_4_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:1047:2: ( (otherlv_0= 'listener' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'protocol:' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) otherlv_7= 'targetCluster:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalLoadBalancer.g:1048:2: (otherlv_0= 'listener' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'protocol:' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) otherlv_7= 'targetCluster:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalLoadBalancer.g:1048:2: (otherlv_0= 'listener' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'protocol:' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) otherlv_7= 'targetCluster:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalLoadBalancer.g:1049:3: otherlv_0= 'listener' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'protocol:' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= 'port:' ( (lv_port_6_0= RULE_INT ) ) otherlv_7= 'targetCluster:' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListenerAccess().getListenerKeyword_0());
            		
            // InternalLoadBalancer.g:1053:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLoadBalancer.g:1054:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLoadBalancer.g:1054:4: (lv_name_1_0= RULE_ID )
            // InternalLoadBalancer.g:1055:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getListenerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListenerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getListenerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getListenerAccess().getProtocolKeyword_3());
            		
            // InternalLoadBalancer.g:1079:3: ( (lv_protocol_4_0= ruleProtocol ) )
            // InternalLoadBalancer.g:1080:4: (lv_protocol_4_0= ruleProtocol )
            {
            // InternalLoadBalancer.g:1080:4: (lv_protocol_4_0= ruleProtocol )
            // InternalLoadBalancer.g:1081:5: lv_protocol_4_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getListenerAccess().getProtocolProtocolEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_protocol_4_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListenerRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"org.loadbalancer.dsl.LoadBalancer.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getListenerAccess().getPortKeyword_5());
            		
            // InternalLoadBalancer.g:1102:3: ( (lv_port_6_0= RULE_INT ) )
            // InternalLoadBalancer.g:1103:4: (lv_port_6_0= RULE_INT )
            {
            // InternalLoadBalancer.g:1103:4: (lv_port_6_0= RULE_INT )
            // InternalLoadBalancer.g:1104:5: lv_port_6_0= RULE_INT
            {
            lv_port_6_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_port_6_0, grammarAccess.getListenerAccess().getPortINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListenerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getListenerAccess().getTargetClusterKeyword_7());
            		
            // InternalLoadBalancer.g:1124:3: ( (otherlv_8= RULE_ID ) )
            // InternalLoadBalancer.g:1125:4: (otherlv_8= RULE_ID )
            {
            // InternalLoadBalancer.g:1125:4: (otherlv_8= RULE_ID )
            // InternalLoadBalancer.g:1126:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListenerRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_8, grammarAccess.getListenerAccess().getTargetClusterClusterCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getListenerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListener"


    // $ANTLR start "entryRuleAlert"
    // InternalLoadBalancer.g:1145:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // InternalLoadBalancer.g:1145:46: (iv_ruleAlert= ruleAlert EOF )
            // InternalLoadBalancer.g:1146:2: iv_ruleAlert= ruleAlert EOF
            {
             newCompositeNode(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlert=ruleAlert();

            state._fsp--;

             current =iv_ruleAlert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // InternalLoadBalancer.g:1152:1: ruleAlert returns [EObject current=null] : (otherlv_0= 'alert' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'threshold:' ( (lv_threshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_threshold_6_0=null;
        Token otherlv_7=null;
        Token lv_action_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_metric_4_0 = null;



        	enterRule();

        try {
            // InternalLoadBalancer.g:1158:2: ( (otherlv_0= 'alert' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'threshold:' ( (lv_threshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalLoadBalancer.g:1159:2: (otherlv_0= 'alert' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'threshold:' ( (lv_threshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalLoadBalancer.g:1159:2: (otherlv_0= 'alert' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'threshold:' ( (lv_threshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalLoadBalancer.g:1160:3: otherlv_0= 'alert' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'metric:' ( (lv_metric_4_0= ruleMetric ) ) otherlv_5= 'threshold:' ( (lv_threshold_6_0= RULE_DOUBLE ) ) otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlertAccess().getAlertKeyword_0());
            		
            // InternalLoadBalancer.g:1164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLoadBalancer.g:1165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLoadBalancer.g:1165:4: (lv_name_1_0= RULE_ID )
            // InternalLoadBalancer.g:1166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlertAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getAlertAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getAlertAccess().getMetricKeyword_3());
            		
            // InternalLoadBalancer.g:1190:3: ( (lv_metric_4_0= ruleMetric ) )
            // InternalLoadBalancer.g:1191:4: (lv_metric_4_0= ruleMetric )
            {
            // InternalLoadBalancer.g:1191:4: (lv_metric_4_0= ruleMetric )
            // InternalLoadBalancer.g:1192:5: lv_metric_4_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getAlertAccess().getMetricMetricEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_45);
            lv_metric_4_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlertRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_4_0,
            						"org.loadbalancer.dsl.LoadBalancer.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getAlertAccess().getThresholdKeyword_5());
            		
            // InternalLoadBalancer.g:1213:3: ( (lv_threshold_6_0= RULE_DOUBLE ) )
            // InternalLoadBalancer.g:1214:4: (lv_threshold_6_0= RULE_DOUBLE )
            {
            // InternalLoadBalancer.g:1214:4: (lv_threshold_6_0= RULE_DOUBLE )
            // InternalLoadBalancer.g:1215:5: lv_threshold_6_0= RULE_DOUBLE
            {
            lv_threshold_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_46); 

            					newLeafNode(lv_threshold_6_0, grammarAccess.getAlertAccess().getThresholdDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"threshold",
            						lv_threshold_6_0,
            						"org.loadbalancer.dsl.LoadBalancer.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAlertAccess().getActionKeyword_7());
            		
            // InternalLoadBalancer.g:1235:3: ( (lv_action_8_0= RULE_STRING ) )
            // InternalLoadBalancer.g:1236:4: (lv_action_8_0= RULE_STRING )
            {
            // InternalLoadBalancer.g:1236:4: (lv_action_8_0= RULE_STRING )
            // InternalLoadBalancer.g:1237:5: lv_action_8_0= RULE_STRING
            {
            lv_action_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_action_8_0, grammarAccess.getAlertAccess().getActionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAlertAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlert"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalLoadBalancer.g:1261:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalLoadBalancer.g:1261:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalLoadBalancer.g:1262:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalLoadBalancer.g:1268:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalLoadBalancer.g:1274:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalLoadBalancer.g:1275:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalLoadBalancer.g:1275:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalLoadBalancer.g:1276:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalLoadBalancer.g:1276:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalLoadBalancer.g:1277:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalLoadBalancer.g:1277:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            else if ( (LA16_0==50) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLoadBalancer.g:1278:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLoadBalancer.g:1289:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "ruleAlgorithm"
    // InternalLoadBalancer.g:1305:1: ruleAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'ROUND_ROBIN' ) | (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' ) | (enumLiteral_2= 'LEAST_CONNECTIONS' ) | (enumLiteral_3= 'IP_HASH' ) | (enumLiteral_4= 'RANDOM' ) ) ;
    public final Enumerator ruleAlgorithm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLoadBalancer.g:1311:2: ( ( (enumLiteral_0= 'ROUND_ROBIN' ) | (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' ) | (enumLiteral_2= 'LEAST_CONNECTIONS' ) | (enumLiteral_3= 'IP_HASH' ) | (enumLiteral_4= 'RANDOM' ) ) )
            // InternalLoadBalancer.g:1312:2: ( (enumLiteral_0= 'ROUND_ROBIN' ) | (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' ) | (enumLiteral_2= 'LEAST_CONNECTIONS' ) | (enumLiteral_3= 'IP_HASH' ) | (enumLiteral_4= 'RANDOM' ) )
            {
            // InternalLoadBalancer.g:1312:2: ( (enumLiteral_0= 'ROUND_ROBIN' ) | (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' ) | (enumLiteral_2= 'LEAST_CONNECTIONS' ) | (enumLiteral_3= 'IP_HASH' ) | (enumLiteral_4= 'RANDOM' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt17=1;
                }
                break;
            case 52:
                {
                alt17=2;
                }
                break;
            case 53:
                {
                alt17=3;
                }
                break;
            case 54:
                {
                alt17=4;
                }
                break;
            case 55:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalLoadBalancer.g:1313:3: (enumLiteral_0= 'ROUND_ROBIN' )
                    {
                    // InternalLoadBalancer.g:1313:3: (enumLiteral_0= 'ROUND_ROBIN' )
                    // InternalLoadBalancer.g:1314:4: enumLiteral_0= 'ROUND_ROBIN'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getROUND_ROBINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgorithmAccess().getROUND_ROBINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLoadBalancer.g:1321:3: (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' )
                    {
                    // InternalLoadBalancer.g:1321:3: (enumLiteral_1= 'WEIGHTED_ROUND_ROBIN' )
                    // InternalLoadBalancer.g:1322:4: enumLiteral_1= 'WEIGHTED_ROUND_ROBIN'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getWEIGHTED_ROUND_ROBINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgorithmAccess().getWEIGHTED_ROUND_ROBINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLoadBalancer.g:1329:3: (enumLiteral_2= 'LEAST_CONNECTIONS' )
                    {
                    // InternalLoadBalancer.g:1329:3: (enumLiteral_2= 'LEAST_CONNECTIONS' )
                    // InternalLoadBalancer.g:1330:4: enumLiteral_2= 'LEAST_CONNECTIONS'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getLEAST_CONNECTIONSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgorithmAccess().getLEAST_CONNECTIONSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLoadBalancer.g:1337:3: (enumLiteral_3= 'IP_HASH' )
                    {
                    // InternalLoadBalancer.g:1337:3: (enumLiteral_3= 'IP_HASH' )
                    // InternalLoadBalancer.g:1338:4: enumLiteral_3= 'IP_HASH'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getIP_HASHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAlgorithmAccess().getIP_HASHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLoadBalancer.g:1345:3: (enumLiteral_4= 'RANDOM' )
                    {
                    // InternalLoadBalancer.g:1345:3: (enumLiteral_4= 'RANDOM' )
                    // InternalLoadBalancer.g:1346:4: enumLiteral_4= 'RANDOM'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getRANDOMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAlgorithmAccess().getRANDOMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "ruleProtocol"
    // InternalLoadBalancer.g:1356:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'TCP' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLoadBalancer.g:1362:2: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'TCP' ) ) )
            // InternalLoadBalancer.g:1363:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'TCP' ) )
            {
            // InternalLoadBalancer.g:1363:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'TCP' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt18=1;
                }
                break;
            case 57:
                {
                alt18=2;
                }
                break;
            case 58:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLoadBalancer.g:1364:3: (enumLiteral_0= 'HTTP' )
                    {
                    // InternalLoadBalancer.g:1364:3: (enumLiteral_0= 'HTTP' )
                    // InternalLoadBalancer.g:1365:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLoadBalancer.g:1372:3: (enumLiteral_1= 'HTTPS' )
                    {
                    // InternalLoadBalancer.g:1372:3: (enumLiteral_1= 'HTTPS' )
                    // InternalLoadBalancer.g:1373:4: enumLiteral_1= 'HTTPS'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLoadBalancer.g:1380:3: (enumLiteral_2= 'TCP' )
                    {
                    // InternalLoadBalancer.g:1380:3: (enumLiteral_2= 'TCP' )
                    // InternalLoadBalancer.g:1381:4: enumLiteral_2= 'TCP'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getTCPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getTCPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "ruleMetric"
    // InternalLoadBalancer.g:1391:1: ruleMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'CPU_USAGE' ) | (enumLiteral_1= 'MEMORY_USAGE' ) | (enumLiteral_2= 'RESPONSE_TIME' ) | (enumLiteral_3= 'REQUEST_COUNT' ) | (enumLiteral_4= 'ERROR_RATE' ) ) ;
    public final Enumerator ruleMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLoadBalancer.g:1397:2: ( ( (enumLiteral_0= 'CPU_USAGE' ) | (enumLiteral_1= 'MEMORY_USAGE' ) | (enumLiteral_2= 'RESPONSE_TIME' ) | (enumLiteral_3= 'REQUEST_COUNT' ) | (enumLiteral_4= 'ERROR_RATE' ) ) )
            // InternalLoadBalancer.g:1398:2: ( (enumLiteral_0= 'CPU_USAGE' ) | (enumLiteral_1= 'MEMORY_USAGE' ) | (enumLiteral_2= 'RESPONSE_TIME' ) | (enumLiteral_3= 'REQUEST_COUNT' ) | (enumLiteral_4= 'ERROR_RATE' ) )
            {
            // InternalLoadBalancer.g:1398:2: ( (enumLiteral_0= 'CPU_USAGE' ) | (enumLiteral_1= 'MEMORY_USAGE' ) | (enumLiteral_2= 'RESPONSE_TIME' ) | (enumLiteral_3= 'REQUEST_COUNT' ) | (enumLiteral_4= 'ERROR_RATE' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt19=1;
                }
                break;
            case 60:
                {
                alt19=2;
                }
                break;
            case 61:
                {
                alt19=3;
                }
                break;
            case 62:
                {
                alt19=4;
                }
                break;
            case 63:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLoadBalancer.g:1399:3: (enumLiteral_0= 'CPU_USAGE' )
                    {
                    // InternalLoadBalancer.g:1399:3: (enumLiteral_0= 'CPU_USAGE' )
                    // InternalLoadBalancer.g:1400:4: enumLiteral_0= 'CPU_USAGE'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getCPU_USAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricAccess().getCPU_USAGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLoadBalancer.g:1407:3: (enumLiteral_1= 'MEMORY_USAGE' )
                    {
                    // InternalLoadBalancer.g:1407:3: (enumLiteral_1= 'MEMORY_USAGE' )
                    // InternalLoadBalancer.g:1408:4: enumLiteral_1= 'MEMORY_USAGE'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getMEMORY_USAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricAccess().getMEMORY_USAGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLoadBalancer.g:1415:3: (enumLiteral_2= 'RESPONSE_TIME' )
                    {
                    // InternalLoadBalancer.g:1415:3: (enumLiteral_2= 'RESPONSE_TIME' )
                    // InternalLoadBalancer.g:1416:4: enumLiteral_2= 'RESPONSE_TIME'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getRESPONSE_TIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricAccess().getRESPONSE_TIMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLoadBalancer.g:1423:3: (enumLiteral_3= 'REQUEST_COUNT' )
                    {
                    // InternalLoadBalancer.g:1423:3: (enumLiteral_3= 'REQUEST_COUNT' )
                    // InternalLoadBalancer.g:1424:4: enumLiteral_3= 'REQUEST_COUNT'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getREQUEST_COUNTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricAccess().getREQUEST_COUNTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLoadBalancer.g:1431:3: (enumLiteral_4= 'ERROR_RATE' )
                    {
                    // InternalLoadBalancer.g:1431:3: (enumLiteral_4= 'ERROR_RATE' )
                    // InternalLoadBalancer.g:1432:4: enumLiteral_4= 'ERROR_RATE'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getERROR_RATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricAccess().getERROR_RATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "rulePersistenceType"
    // InternalLoadBalancer.g:1442:1: rulePersistenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'COOKIE' ) | (enumLiteral_1= 'IP' ) | (enumLiteral_2= 'HEADER' ) ) ;
    public final Enumerator rulePersistenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLoadBalancer.g:1448:2: ( ( (enumLiteral_0= 'COOKIE' ) | (enumLiteral_1= 'IP' ) | (enumLiteral_2= 'HEADER' ) ) )
            // InternalLoadBalancer.g:1449:2: ( (enumLiteral_0= 'COOKIE' ) | (enumLiteral_1= 'IP' ) | (enumLiteral_2= 'HEADER' ) )
            {
            // InternalLoadBalancer.g:1449:2: ( (enumLiteral_0= 'COOKIE' ) | (enumLiteral_1= 'IP' ) | (enumLiteral_2= 'HEADER' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt20=1;
                }
                break;
            case 65:
                {
                alt20=2;
                }
                break;
            case 66:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalLoadBalancer.g:1450:3: (enumLiteral_0= 'COOKIE' )
                    {
                    // InternalLoadBalancer.g:1450:3: (enumLiteral_0= 'COOKIE' )
                    // InternalLoadBalancer.g:1451:4: enumLiteral_0= 'COOKIE'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getPersistenceTypeAccess().getCOOKIEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPersistenceTypeAccess().getCOOKIEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLoadBalancer.g:1458:3: (enumLiteral_1= 'IP' )
                    {
                    // InternalLoadBalancer.g:1458:3: (enumLiteral_1= 'IP' )
                    // InternalLoadBalancer.g:1459:4: enumLiteral_1= 'IP'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getPersistenceTypeAccess().getIPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPersistenceTypeAccess().getIPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLoadBalancer.g:1466:3: (enumLiteral_2= 'HEADER' )
                    {
                    // InternalLoadBalancer.g:1466:3: (enumLiteral_2= 'HEADER' )
                    // InternalLoadBalancer.g:1467:4: enumLiteral_2= 'HEADER'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getPersistenceTypeAccess().getHEADEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPersistenceTypeAccess().getHEADEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000010000002C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000500000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004008210000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00F8000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});

}