package org.openhab.core.model.parser.antlr.internal;

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
import org.openhab.core.model.services.ItemsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalItemsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", "'Group'", "':'", "'Number'", "'Switch'", "'Rollershutter'", "'String'", "'Dimmer'", "'Contact'", "'DateTime'", "'Color'", "'Player'", "'Location'", "'Call'", "'Image'", "'='", "'true'", "'false'", "'.'", "'EQUALITY'", "'AND'", "'OR'", "'NAND'", "'NOR'", "'AVG'", "'SUM'", "'MAX'", "'MIN'", "'COUNT'", "'LATEST'", "'EARLIEST'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
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
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__48=48;
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


        public InternalItemsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalItemsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalItemsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalItems.g"; }



     	private ItemsGrammarAccess grammarAccess;

        public InternalItemsParser(TokenStream input, ItemsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ItemModel";
       	}

       	@Override
       	protected ItemsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleItemModel"
    // InternalItems.g:65:1: entryRuleItemModel returns [EObject current=null] : iv_ruleItemModel= ruleItemModel EOF ;
    public final EObject entryRuleItemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemModel = null;


        try {
            // InternalItems.g:65:50: (iv_ruleItemModel= ruleItemModel EOF )
            // InternalItems.g:66:2: iv_ruleItemModel= ruleItemModel EOF
            {
             newCompositeNode(grammarAccess.getItemModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemModel=ruleItemModel();

            state._fsp--;

             current =iv_ruleItemModel; 
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
    // $ANTLR end "entryRuleItemModel"


    // $ANTLR start "ruleItemModel"
    // InternalItems.g:72:1: ruleItemModel returns [EObject current=null] : ( () ( (lv_items_1_0= ruleModelItem ) )* ) ;
    public final EObject ruleItemModel() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalItems.g:78:2: ( ( () ( (lv_items_1_0= ruleModelItem ) )* ) )
            // InternalItems.g:79:2: ( () ( (lv_items_1_0= ruleModelItem ) )* )
            {
            // InternalItems.g:79:2: ( () ( (lv_items_1_0= ruleModelItem ) )* )
            // InternalItems.g:80:3: () ( (lv_items_1_0= ruleModelItem ) )*
            {
            // InternalItems.g:80:3: ()
            // InternalItems.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItemModelAccess().getItemModelAction_0(),
            					current);
            			

            }

            // InternalItems.g:87:3: ( (lv_items_1_0= ruleModelItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||(LA1_0>=21 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalItems.g:88:4: (lv_items_1_0= ruleModelItem )
            	    {
            	    // InternalItems.g:88:4: (lv_items_1_0= ruleModelItem )
            	    // InternalItems.g:89:5: lv_items_1_0= ruleModelItem
            	    {

            	    					newCompositeNode(grammarAccess.getItemModelAccess().getItemsModelItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_items_1_0=ruleModelItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getItemModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"org.openhab.core.model.Items.ModelItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleItemModel"


    // $ANTLR start "entryRuleModelItem"
    // InternalItems.g:110:1: entryRuleModelItem returns [EObject current=null] : iv_ruleModelItem= ruleModelItem EOF ;
    public final EObject entryRuleModelItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelItem = null;


        try {
            // InternalItems.g:110:50: (iv_ruleModelItem= ruleModelItem EOF )
            // InternalItems.g:111:2: iv_ruleModelItem= ruleModelItem EOF
            {
             newCompositeNode(grammarAccess.getModelItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelItem=ruleModelItem();

            state._fsp--;

             current =iv_ruleModelItem; 
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
    // $ANTLR end "entryRuleModelItem"


    // $ANTLR start "ruleModelItem"
    // InternalItems.g:117:1: ruleModelItem returns [EObject current=null] : ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )? (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleModelItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_icon_5_1=null;
        Token lv_icon_5_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_groups_8_0=null;
        Token otherlv_9=null;
        Token lv_groups_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_tags_13_1=null;
        Token lv_tags_13_2=null;
        Token otherlv_14=null;
        Token lv_tags_15_1=null;
        Token lv_tags_15_2=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_ModelNormalItem_0 = null;

        EObject this_ModelGroupItem_1 = null;

        EObject lv_bindings_18_0 = null;

        EObject lv_bindings_20_0 = null;



        	enterRule();

        try {
            // InternalItems.g:123:2: ( ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )? (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )? ) )
            // InternalItems.g:124:2: ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )? (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )? )
            {
            // InternalItems.g:124:2: ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )? (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )? )
            // InternalItems.g:125:3: (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )? (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )?
            {
            // InternalItems.g:125:3: (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=21 && LA2_0<=32)) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalItems.g:126:4: this_ModelNormalItem_0= ruleModelNormalItem
                    {

                    				newCompositeNode(grammarAccess.getModelItemAccess().getModelNormalItemParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_ModelNormalItem_0=ruleModelNormalItem();

                    state._fsp--;


                    				current = this_ModelNormalItem_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalItems.g:135:4: this_ModelGroupItem_1= ruleModelGroupItem
                    {

                    				newCompositeNode(grammarAccess.getModelItemAccess().getModelGroupItemParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_ModelGroupItem_1=ruleModelGroupItem();

                    state._fsp--;


                    				current = this_ModelGroupItem_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalItems.g:144:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalItems.g:145:4: (lv_name_2_0= RULE_ID )
            {
            // InternalItems.g:145:4: (lv_name_2_0= RULE_ID )
            // InternalItems.g:146:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.openhab.core.model.Items.ID");
            				

            }


            }

            // InternalItems.g:162:3: ( (lv_label_3_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalItems.g:163:4: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalItems.g:163:4: (lv_label_3_0= RULE_STRING )
                    // InternalItems.g:164:5: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_label_3_0, grammarAccess.getModelItemAccess().getLabelSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_3_0,
                    						"org.openhab.core.model.Items.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalItems.g:180:3: (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalItems.g:181:4: otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,10,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelItemAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalItems.g:185:4: ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) )
                    // InternalItems.g:186:5: ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) )
                    {
                    // InternalItems.g:186:5: ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) )
                    // InternalItems.g:187:6: (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING )
                    {
                    // InternalItems.g:187:6: (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_STRING) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalItems.g:188:7: lv_icon_5_1= RULE_ID
                            {
                            lv_icon_5_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(lv_icon_5_1, grammarAccess.getModelItemAccess().getIconIDTerminalRuleCall_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"icon",
                            								lv_icon_5_1,
                            								"org.openhab.core.model.Items.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalItems.g:203:7: lv_icon_5_2= RULE_STRING
                            {
                            lv_icon_5_2=(Token)match(input,RULE_STRING,FOLLOW_8); 

                            							newLeafNode(lv_icon_5_2, grammarAccess.getModelItemAccess().getIconSTRINGTerminalRuleCall_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"icon",
                            								lv_icon_5_2,
                            								"org.openhab.core.model.Items.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelItemAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalItems.g:225:3: (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalItems.g:226:4: otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelItemAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalItems.g:230:4: ( (lv_groups_8_0= RULE_ID ) )
                    // InternalItems.g:231:5: (lv_groups_8_0= RULE_ID )
                    {
                    // InternalItems.g:231:5: (lv_groups_8_0= RULE_ID )
                    // InternalItems.g:232:6: lv_groups_8_0= RULE_ID
                    {
                    lv_groups_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_groups_8_0, grammarAccess.getModelItemAccess().getGroupsIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelItemRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"groups",
                    							lv_groups_8_0,
                    							"org.openhab.core.model.Items.ID");
                    					

                    }


                    }

                    // InternalItems.g:248:4: (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalItems.g:249:5: otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getModelItemAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalItems.g:253:5: ( (lv_groups_10_0= RULE_ID ) )
                    	    // InternalItems.g:254:6: (lv_groups_10_0= RULE_ID )
                    	    {
                    	    // InternalItems.g:254:6: (lv_groups_10_0= RULE_ID )
                    	    // InternalItems.g:255:7: lv_groups_10_0= RULE_ID
                    	    {
                    	    lv_groups_10_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(lv_groups_10_0, grammarAccess.getModelItemAccess().getGroupsIDTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelItemRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_10_0,
                    	    								"org.openhab.core.model.Items.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelItemAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalItems.g:277:3: (otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalItems.g:278:4: otherlv_12= '[' ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) ) (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )* otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelItemAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalItems.g:282:4: ( ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) ) )
                    // InternalItems.g:283:5: ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) )
                    {
                    // InternalItems.g:283:5: ( (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING ) )
                    // InternalItems.g:284:6: (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING )
                    {
                    // InternalItems.g:284:6: (lv_tags_13_1= RULE_ID | lv_tags_13_2= RULE_STRING )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalItems.g:285:7: lv_tags_13_1= RULE_ID
                            {
                            lv_tags_13_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                            							newLeafNode(lv_tags_13_1, grammarAccess.getModelItemAccess().getTagsIDTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"tags",
                            								lv_tags_13_1,
                            								"org.openhab.core.model.Items.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalItems.g:300:7: lv_tags_13_2= RULE_STRING
                            {
                            lv_tags_13_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            							newLeafNode(lv_tags_13_2, grammarAccess.getModelItemAccess().getTagsSTRINGTerminalRuleCall_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"tags",
                            								lv_tags_13_2,
                            								"org.openhab.core.model.Items.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalItems.g:317:4: (otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalItems.g:318:5: otherlv_14= ',' ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getModelItemAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalItems.g:322:5: ( ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) ) )
                    	    // InternalItems.g:323:6: ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) )
                    	    {
                    	    // InternalItems.g:323:6: ( (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING ) )
                    	    // InternalItems.g:324:7: (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING )
                    	    {
                    	    // InternalItems.g:324:7: (lv_tags_15_1= RULE_ID | lv_tags_15_2= RULE_STRING )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==RULE_ID) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==RULE_STRING) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalItems.g:325:8: lv_tags_15_1= RULE_ID
                    	            {
                    	            lv_tags_15_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	            								newLeafNode(lv_tags_15_1, grammarAccess.getModelItemAccess().getTagsIDTerminalRuleCall_5_2_1_0_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getModelItemRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"tags",
                    	            									lv_tags_15_1,
                    	            									"org.openhab.core.model.Items.ID");
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalItems.g:340:8: lv_tags_15_2= RULE_STRING
                    	            {
                    	            lv_tags_15_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    	            								newLeafNode(lv_tags_15_2, grammarAccess.getModelItemAccess().getTagsSTRINGTerminalRuleCall_5_2_1_0_1());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getModelItemRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"tags",
                    	            									lv_tags_15_2,
                    	            									"org.openhab.core.model.Items.STRING");
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelItemAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalItems.g:363:3: (otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalItems.g:364:4: otherlv_17= '{' ( (lv_bindings_18_0= ruleModelBinding ) ) (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )* otherlv_21= '}'
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getModelItemAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalItems.g:368:4: ( (lv_bindings_18_0= ruleModelBinding ) )
                    // InternalItems.g:369:5: (lv_bindings_18_0= ruleModelBinding )
                    {
                    // InternalItems.g:369:5: (lv_bindings_18_0= ruleModelBinding )
                    // InternalItems.g:370:6: lv_bindings_18_0= ruleModelBinding
                    {

                    						newCompositeNode(grammarAccess.getModelItemAccess().getBindingsModelBindingParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_bindings_18_0=ruleModelBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelItemRule());
                    						}
                    						add(
                    							current,
                    							"bindings",
                    							lv_bindings_18_0,
                    							"org.openhab.core.model.Items.ModelBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalItems.g:387:4: (otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalItems.g:388:5: otherlv_19= ',' ( (lv_bindings_20_0= ruleModelBinding ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getModelItemAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalItems.g:392:5: ( (lv_bindings_20_0= ruleModelBinding ) )
                    	    // InternalItems.g:393:6: (lv_bindings_20_0= ruleModelBinding )
                    	    {
                    	    // InternalItems.g:393:6: (lv_bindings_20_0= ruleModelBinding )
                    	    // InternalItems.g:394:7: lv_bindings_20_0= ruleModelBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelItemAccess().getBindingsModelBindingParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_bindings_20_0=ruleModelBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelItemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bindings",
                    	    								lv_bindings_20_0,
                    	    								"org.openhab.core.model.Items.ModelBinding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getModelItemAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelItem"


    // $ANTLR start "entryRuleModelGroupItem"
    // InternalItems.g:421:1: entryRuleModelGroupItem returns [EObject current=null] : iv_ruleModelGroupItem= ruleModelGroupItem EOF ;
    public final EObject entryRuleModelGroupItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelGroupItem = null;


        try {
            // InternalItems.g:421:55: (iv_ruleModelGroupItem= ruleModelGroupItem EOF )
            // InternalItems.g:422:2: iv_ruleModelGroupItem= ruleModelGroupItem EOF
            {
             newCompositeNode(grammarAccess.getModelGroupItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelGroupItem=ruleModelGroupItem();

            state._fsp--;

             current =iv_ruleModelGroupItem; 
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
    // $ANTLR end "entryRuleModelGroupItem"


    // $ANTLR start "ruleModelGroupItem"
    // InternalItems.g:428:1: ruleModelGroupItem returns [EObject current=null] : ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? ) ;
    public final EObject ruleModelGroupItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_args_7_1=null;
        Token lv_args_7_2=null;
        Token otherlv_8=null;
        Token lv_args_9_1=null;
        Token lv_args_9_2=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        Enumerator lv_function_5_0 = null;



        	enterRule();

        try {
            // InternalItems.g:434:2: ( ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? ) )
            // InternalItems.g:435:2: ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? )
            {
            // InternalItems.g:435:2: ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? )
            // InternalItems.g:436:3: () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )?
            {
            // InternalItems.g:436:3: ()
            // InternalItems.g:437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelGroupItemAccess().getModelGroupItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getModelGroupItemAccess().getGroupKeyword_1());
            		
            // InternalItems.g:447:3: (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalItems.g:448:4: otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )?
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelGroupItemAccess().getColonKeyword_2_0());
                    			
                    // InternalItems.g:452:4: ( (lv_type_3_0= ruleModelItemType ) )
                    // InternalItems.g:453:5: (lv_type_3_0= ruleModelItemType )
                    {
                    // InternalItems.g:453:5: (lv_type_3_0= ruleModelItemType )
                    // InternalItems.g:454:6: lv_type_3_0= ruleModelItemType
                    {

                    						newCompositeNode(grammarAccess.getModelGroupItemAccess().getTypeModelItemTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_3_0=ruleModelItemType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelGroupItemRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.openhab.core.model.Items.ModelItemType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalItems.g:471:4: (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==20) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalItems.g:472:5: otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )?
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_17); 

                            					newLeafNode(otherlv_4, grammarAccess.getModelGroupItemAccess().getColonKeyword_2_2_0());
                            				
                            // InternalItems.g:476:5: ( (lv_function_5_0= ruleModelGroupFunction ) )
                            // InternalItems.g:477:6: (lv_function_5_0= ruleModelGroupFunction )
                            {
                            // InternalItems.g:477:6: (lv_function_5_0= ruleModelGroupFunction )
                            // InternalItems.g:478:7: lv_function_5_0= ruleModelGroupFunction
                            {

                            							newCompositeNode(grammarAccess.getModelGroupItemAccess().getFunctionModelGroupFunctionEnumRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_function_5_0=ruleModelGroupFunction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelGroupItemRule());
                            							}
                            							set(
                            								current,
                            								"function",
                            								lv_function_5_0,
                            								"org.openhab.core.model.Items.ModelGroupFunction");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalItems.g:495:5: (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==12) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalItems.g:496:6: otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')'
                                    {
                                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                                    						newLeafNode(otherlv_6, grammarAccess.getModelGroupItemAccess().getLeftParenthesisKeyword_2_2_2_0());
                                    					
                                    // InternalItems.g:500:6: ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) )
                                    // InternalItems.g:501:7: ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) )
                                    {
                                    // InternalItems.g:501:7: ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) )
                                    // InternalItems.g:502:8: (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING )
                                    {
                                    // InternalItems.g:502:8: (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING )
                                    int alt14=2;
                                    int LA14_0 = input.LA(1);

                                    if ( (LA14_0==RULE_ID) ) {
                                        alt14=1;
                                    }
                                    else if ( (LA14_0==RULE_STRING) ) {
                                        alt14=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 14, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt14) {
                                        case 1 :
                                            // InternalItems.g:503:9: lv_args_7_1= RULE_ID
                                            {
                                            lv_args_7_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                                            									newLeafNode(lv_args_7_1, grammarAccess.getModelGroupItemAccess().getArgsIDTerminalRuleCall_2_2_2_1_0_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getModelGroupItemRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"args",
                                            										lv_args_7_1,
                                            										"org.openhab.core.model.Items.ID");
                                            								

                                            }
                                            break;
                                        case 2 :
                                            // InternalItems.g:518:9: lv_args_7_2= RULE_STRING
                                            {
                                            lv_args_7_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                                            									newLeafNode(lv_args_7_2, grammarAccess.getModelGroupItemAccess().getArgsSTRINGTerminalRuleCall_2_2_2_1_0_1());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getModelGroupItemRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"args",
                                            										lv_args_7_2,
                                            										"org.openhab.core.model.Items.STRING");
                                            								

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // InternalItems.g:535:6: (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )*
                                    loop16:
                                    do {
                                        int alt16=2;
                                        int LA16_0 = input.LA(1);

                                        if ( (LA16_0==13) ) {
                                            alt16=1;
                                        }


                                        switch (alt16) {
                                    	case 1 :
                                    	    // InternalItems.g:536:7: otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) )
                                    	    {
                                    	    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                                    	    							newLeafNode(otherlv_8, grammarAccess.getModelGroupItemAccess().getCommaKeyword_2_2_2_2_0());
                                    	    						
                                    	    // InternalItems.g:540:7: ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) )
                                    	    // InternalItems.g:541:8: ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) )
                                    	    {
                                    	    // InternalItems.g:541:8: ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) )
                                    	    // InternalItems.g:542:9: (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING )
                                    	    {
                                    	    // InternalItems.g:542:9: (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING )
                                    	    int alt15=2;
                                    	    int LA15_0 = input.LA(1);

                                    	    if ( (LA15_0==RULE_ID) ) {
                                    	        alt15=1;
                                    	    }
                                    	    else if ( (LA15_0==RULE_STRING) ) {
                                    	        alt15=2;
                                    	    }
                                    	    else {
                                    	        NoViableAltException nvae =
                                    	            new NoViableAltException("", 15, 0, input);

                                    	        throw nvae;
                                    	    }
                                    	    switch (alt15) {
                                    	        case 1 :
                                    	            // InternalItems.g:543:10: lv_args_9_1= RULE_ID
                                    	            {
                                    	            lv_args_9_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                                    	            										newLeafNode(lv_args_9_1, grammarAccess.getModelGroupItemAccess().getArgsIDTerminalRuleCall_2_2_2_2_1_0_0());
                                    	            									

                                    	            										if (current==null) {
                                    	            											current = createModelElement(grammarAccess.getModelGroupItemRule());
                                    	            										}
                                    	            										addWithLastConsumed(
                                    	            											current,
                                    	            											"args",
                                    	            											lv_args_9_1,
                                    	            											"org.openhab.core.model.Items.ID");
                                    	            									

                                    	            }
                                    	            break;
                                    	        case 2 :
                                    	            // InternalItems.g:558:10: lv_args_9_2= RULE_STRING
                                    	            {
                                    	            lv_args_9_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                                    	            										newLeafNode(lv_args_9_2, grammarAccess.getModelGroupItemAccess().getArgsSTRINGTerminalRuleCall_2_2_2_2_1_0_1());
                                    	            									

                                    	            										if (current==null) {
                                    	            											current = createModelElement(grammarAccess.getModelGroupItemRule());
                                    	            										}
                                    	            										addWithLastConsumed(
                                    	            											current,
                                    	            											"args",
                                    	            											lv_args_9_2,
                                    	            											"org.openhab.core.model.Items.STRING");
                                    	            									

                                    	            }
                                    	            break;

                                    	    }


                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop16;
                                        }
                                    } while (true);

                                    otherlv_10=(Token)match(input,14,FOLLOW_2); 

                                    						newLeafNode(otherlv_10, grammarAccess.getModelGroupItemAccess().getRightParenthesisKeyword_2_2_2_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleModelGroupItem"


    // $ANTLR start "entryRuleModelNormalItem"
    // InternalItems.g:587:1: entryRuleModelNormalItem returns [EObject current=null] : iv_ruleModelNormalItem= ruleModelNormalItem EOF ;
    public final EObject entryRuleModelNormalItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNormalItem = null;


        try {
            // InternalItems.g:587:56: (iv_ruleModelNormalItem= ruleModelNormalItem EOF )
            // InternalItems.g:588:2: iv_ruleModelNormalItem= ruleModelNormalItem EOF
            {
             newCompositeNode(grammarAccess.getModelNormalItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelNormalItem=ruleModelNormalItem();

            state._fsp--;

             current =iv_ruleModelNormalItem; 
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
    // $ANTLR end "entryRuleModelNormalItem"


    // $ANTLR start "ruleModelNormalItem"
    // InternalItems.g:594:1: ruleModelNormalItem returns [EObject current=null] : ( (lv_type_0_0= ruleModelItemType ) ) ;
    public final EObject ruleModelNormalItem() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalItems.g:600:2: ( ( (lv_type_0_0= ruleModelItemType ) ) )
            // InternalItems.g:601:2: ( (lv_type_0_0= ruleModelItemType ) )
            {
            // InternalItems.g:601:2: ( (lv_type_0_0= ruleModelItemType ) )
            // InternalItems.g:602:3: (lv_type_0_0= ruleModelItemType )
            {
            // InternalItems.g:602:3: (lv_type_0_0= ruleModelItemType )
            // InternalItems.g:603:4: lv_type_0_0= ruleModelItemType
            {

            				newCompositeNode(grammarAccess.getModelNormalItemAccess().getTypeModelItemTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleModelItemType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelNormalItemRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.openhab.core.model.Items.ModelItemType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModelNormalItem"


    // $ANTLR start "entryRuleModelItemType"
    // InternalItems.g:623:1: entryRuleModelItemType returns [String current=null] : iv_ruleModelItemType= ruleModelItemType EOF ;
    public final String entryRuleModelItemType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModelItemType = null;


        try {
            // InternalItems.g:623:53: (iv_ruleModelItemType= ruleModelItemType EOF )
            // InternalItems.g:624:2: iv_ruleModelItemType= ruleModelItemType EOF
            {
             newCompositeNode(grammarAccess.getModelItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelItemType=ruleModelItemType();

            state._fsp--;

             current =iv_ruleModelItemType.getText(); 
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
    // $ANTLR end "entryRuleModelItemType"


    // $ANTLR start "ruleModelItemType"
    // InternalItems.g:630:1: ruleModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleModelItemType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_BaseModelItemType_0 = null;



        	enterRule();

        try {
            // InternalItems.g:636:2: ( (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? ) ) )
            // InternalItems.g:637:2: (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? ) )
            {
            // InternalItems.g:637:2: (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=22 && LA21_0<=32)) ) {
                alt21=1;
            }
            else if ( (LA21_0==21) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalItems.g:638:3: this_BaseModelItemType_0= ruleBaseModelItemType
                    {

                    			newCompositeNode(grammarAccess.getModelItemTypeAccess().getBaseModelItemTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseModelItemType_0=ruleBaseModelItemType();

                    state._fsp--;


                    			current.merge(this_BaseModelItemType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalItems.g:649:3: (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? )
                    {
                    // InternalItems.g:649:3: (kw= 'Number' (kw= ':' this_ID_3= RULE_ID )? )
                    // InternalItems.g:650:4: kw= 'Number' (kw= ':' this_ID_3= RULE_ID )?
                    {
                    kw=(Token)match(input,21,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getNumberKeyword_1_0());
                    			
                    // InternalItems.g:655:4: (kw= ':' this_ID_3= RULE_ID )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==20) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==RULE_ID) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalItems.g:656:5: kw= ':' this_ID_3= RULE_ID
                            {
                            kw=(Token)match(input,20,FOLLOW_4); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getColonKeyword_1_1_0());
                            				
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                            					current.merge(this_ID_3);
                            				

                            					newLeafNode(this_ID_3, grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleModelItemType"


    // $ANTLR start "entryRuleBaseModelItemType"
    // InternalItems.g:674:1: entryRuleBaseModelItemType returns [String current=null] : iv_ruleBaseModelItemType= ruleBaseModelItemType EOF ;
    public final String entryRuleBaseModelItemType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseModelItemType = null;


        try {
            // InternalItems.g:674:57: (iv_ruleBaseModelItemType= ruleBaseModelItemType EOF )
            // InternalItems.g:675:2: iv_ruleBaseModelItemType= ruleBaseModelItemType EOF
            {
             newCompositeNode(grammarAccess.getBaseModelItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseModelItemType=ruleBaseModelItemType();

            state._fsp--;

             current =iv_ruleBaseModelItemType.getText(); 
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
    // $ANTLR end "entryRuleBaseModelItemType"


    // $ANTLR start "ruleBaseModelItemType"
    // InternalItems.g:681:1: ruleBaseModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Switch' | kw= 'Rollershutter' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleBaseModelItemType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalItems.g:687:2: ( (kw= 'Switch' | kw= 'Rollershutter' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' ) )
            // InternalItems.g:688:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' )
            {
            // InternalItems.g:688:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' )
            int alt22=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt22=1;
                }
                break;
            case 23:
                {
                alt22=2;
                }
                break;
            case 24:
                {
                alt22=3;
                }
                break;
            case 25:
                {
                alt22=4;
                }
                break;
            case 26:
                {
                alt22=5;
                }
                break;
            case 27:
                {
                alt22=6;
                }
                break;
            case 28:
                {
                alt22=7;
                }
                break;
            case 29:
                {
                alt22=8;
                }
                break;
            case 30:
                {
                alt22=9;
                }
                break;
            case 31:
                {
                alt22=10;
                }
                break;
            case 32:
                {
                alt22=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalItems.g:689:3: kw= 'Switch'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getSwitchKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalItems.g:695:3: kw= 'Rollershutter'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getRollershutterKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalItems.g:701:3: kw= 'String'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getStringKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalItems.g:707:3: kw= 'Dimmer'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDimmerKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalItems.g:713:3: kw= 'Contact'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getContactKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalItems.g:719:3: kw= 'DateTime'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDateTimeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalItems.g:725:3: kw= 'Color'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getColorKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalItems.g:731:3: kw= 'Player'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getPlayerKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalItems.g:737:3: kw= 'Location'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getLocationKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalItems.g:743:3: kw= 'Call'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getCallKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalItems.g:749:3: kw= 'Image'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getImageKeyword_10());
                    		

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
    // $ANTLR end "ruleBaseModelItemType"


    // $ANTLR start "entryRuleModelBinding"
    // InternalItems.g:758:1: entryRuleModelBinding returns [EObject current=null] : iv_ruleModelBinding= ruleModelBinding EOF ;
    public final EObject entryRuleModelBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBinding = null;


        try {
            // InternalItems.g:758:53: (iv_ruleModelBinding= ruleModelBinding EOF )
            // InternalItems.g:759:2: iv_ruleModelBinding= ruleModelBinding EOF
            {
             newCompositeNode(grammarAccess.getModelBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelBinding=ruleModelBinding();

            state._fsp--;

             current =iv_ruleModelBinding; 
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
    // $ANTLR end "entryRuleModelBinding"


    // $ANTLR start "ruleModelBinding"
    // InternalItems.g:765:1: ruleModelBinding returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )? ) ;
    public final EObject ruleModelBinding() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_configuration_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalItems.g:771:2: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )? ) )
            // InternalItems.g:772:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )? )
            {
            // InternalItems.g:772:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )? )
            // InternalItems.g:773:3: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )?
            {
            // InternalItems.g:773:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalItems.g:774:4: (lv_type_0_0= RULE_ID )
            {
            // InternalItems.g:774:4: (lv_type_0_0= RULE_ID )
            // InternalItems.g:775:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_type_0_0, grammarAccess.getModelBindingAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.openhab.core.model.Items.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getModelBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalItems.g:795:3: ( (lv_configuration_2_0= RULE_STRING ) )
            // InternalItems.g:796:4: (lv_configuration_2_0= RULE_STRING )
            {
            // InternalItems.g:796:4: (lv_configuration_2_0= RULE_STRING )
            // InternalItems.g:797:5: lv_configuration_2_0= RULE_STRING
            {
            lv_configuration_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_configuration_2_0, grammarAccess.getModelBindingAccess().getConfigurationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"configuration",
            						lv_configuration_2_0,
            						"org.openhab.core.model.Items.STRING");
            				

            }


            }

            // InternalItems.g:813:3: (otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalItems.g:814:4: otherlv_3= '[' ( (lv_properties_4_0= ruleModelProperty ) )? (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelBindingAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalItems.g:818:4: ( (lv_properties_4_0= ruleModelProperty ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalItems.g:819:5: (lv_properties_4_0= ruleModelProperty )
                            {
                            // InternalItems.g:819:5: (lv_properties_4_0= ruleModelProperty )
                            // InternalItems.g:820:6: lv_properties_4_0= ruleModelProperty
                            {

                            						newCompositeNode(grammarAccess.getModelBindingAccess().getPropertiesModelPropertyParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_properties_4_0=ruleModelProperty();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getModelBindingRule());
                            						}
                            						add(
                            							current,
                            							"properties",
                            							lv_properties_4_0,
                            							"org.openhab.core.model.Items.ModelProperty");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalItems.g:837:4: (otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalItems.g:838:5: otherlv_5= ',' ( (lv_properties_6_0= ruleModelProperty ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getModelBindingAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalItems.g:842:5: ( (lv_properties_6_0= ruleModelProperty ) )
                    	    // InternalItems.g:843:6: (lv_properties_6_0= ruleModelProperty )
                    	    {
                    	    // InternalItems.g:843:6: (lv_properties_6_0= ruleModelProperty )
                    	    // InternalItems.g:844:7: lv_properties_6_0= ruleModelProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelBindingAccess().getPropertiesModelPropertyParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_6_0=ruleModelProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelBindingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_6_0,
                    	    								"org.openhab.core.model.Items.ModelProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelBindingAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModelBinding"


    // $ANTLR start "entryRuleModelProperty"
    // InternalItems.g:871:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // InternalItems.g:871:54: (iv_ruleModelProperty= ruleModelProperty EOF )
            // InternalItems.g:872:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
             newCompositeNode(grammarAccess.getModelPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;

             current =iv_ruleModelProperty; 
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
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // InternalItems.g:878:1: ruleModelProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalItems.g:884:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) ) )
            // InternalItems.g:885:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) )
            {
            // InternalItems.g:885:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) )
            // InternalItems.g:886:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) )
            {
            // InternalItems.g:886:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalItems.g:887:4: (lv_key_0_0= RULE_ID )
            {
            // InternalItems.g:887:4: (lv_key_0_0= RULE_ID )
            // InternalItems.g:888:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_key_0_0, grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.openhab.core.model.Items.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalItems.g:908:3: ( (lv_value_2_0= ruleValueType ) )
            // InternalItems.g:909:4: (lv_value_2_0= ruleValueType )
            {
            // InternalItems.g:909:4: (lv_value_2_0= ruleValueType )
            // InternalItems.g:910:5: lv_value_2_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.openhab.core.model.Items.ValueType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleValueType"
    // InternalItems.g:931:1: entryRuleValueType returns [String current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final String entryRuleValueType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueType = null;


        try {
            // InternalItems.g:931:49: (iv_ruleValueType= ruleValueType EOF )
            // InternalItems.g:932:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType.getText(); 
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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalItems.g:938:1: ruleValueType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleValueType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_NUMBER_1 = null;

        AntlrDatatypeRuleToken this_BOOLEAN_2 = null;



        	enterRule();

        try {
            // InternalItems.g:944:2: ( (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN ) )
            // InternalItems.g:945:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN )
            {
            // InternalItems.g:945:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 34:
            case 35:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalItems.g:946:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValueTypeAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalItems.g:954:3: this_NUMBER_1= ruleNUMBER
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getNUMBERParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    			current.merge(this_NUMBER_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalItems.g:965:3: this_BOOLEAN_2= ruleBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getBOOLEANParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_2=ruleBOOLEAN();

                    state._fsp--;


                    			current.merge(this_BOOLEAN_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalItems.g:979:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalItems.g:979:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalItems.g:980:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalItems.g:986:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalItems.g:992:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalItems.g:993:2: (kw= 'true' | kw= 'false' )
            {
            // InternalItems.g:993:2: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            else if ( (LA27_0==35) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalItems.g:994:3: kw= 'true'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalItems.g:1000:3: kw= 'false'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalItems.g:1009:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalItems.g:1009:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalItems.g:1010:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalItems.g:1016:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalItems.g:1022:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalItems.g:1023:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalItems.g:1023:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalItems.g:1024:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_0());
            		
            // InternalItems.g:1031:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalItems.g:1032:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,36,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "ruleModelGroupFunction"
    // InternalItems.g:1049:1: ruleModelGroupFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'EQUALITY' ) | (enumLiteral_1= 'AND' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'NAND' ) | (enumLiteral_4= 'NOR' ) | (enumLiteral_5= 'AVG' ) | (enumLiteral_6= 'SUM' ) | (enumLiteral_7= 'MAX' ) | (enumLiteral_8= 'MIN' ) | (enumLiteral_9= 'COUNT' ) | (enumLiteral_10= 'LATEST' ) | (enumLiteral_11= 'EARLIEST' ) ) ;
    public final Enumerator ruleModelGroupFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalItems.g:1055:2: ( ( (enumLiteral_0= 'EQUALITY' ) | (enumLiteral_1= 'AND' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'NAND' ) | (enumLiteral_4= 'NOR' ) | (enumLiteral_5= 'AVG' ) | (enumLiteral_6= 'SUM' ) | (enumLiteral_7= 'MAX' ) | (enumLiteral_8= 'MIN' ) | (enumLiteral_9= 'COUNT' ) | (enumLiteral_10= 'LATEST' ) | (enumLiteral_11= 'EARLIEST' ) ) )
            // InternalItems.g:1056:2: ( (enumLiteral_0= 'EQUALITY' ) | (enumLiteral_1= 'AND' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'NAND' ) | (enumLiteral_4= 'NOR' ) | (enumLiteral_5= 'AVG' ) | (enumLiteral_6= 'SUM' ) | (enumLiteral_7= 'MAX' ) | (enumLiteral_8= 'MIN' ) | (enumLiteral_9= 'COUNT' ) | (enumLiteral_10= 'LATEST' ) | (enumLiteral_11= 'EARLIEST' ) )
            {
            // InternalItems.g:1056:2: ( (enumLiteral_0= 'EQUALITY' ) | (enumLiteral_1= 'AND' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'NAND' ) | (enumLiteral_4= 'NOR' ) | (enumLiteral_5= 'AVG' ) | (enumLiteral_6= 'SUM' ) | (enumLiteral_7= 'MAX' ) | (enumLiteral_8= 'MIN' ) | (enumLiteral_9= 'COUNT' ) | (enumLiteral_10= 'LATEST' ) | (enumLiteral_11= 'EARLIEST' ) )
            int alt29=12;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            case 40:
                {
                alt29=4;
                }
                break;
            case 41:
                {
                alt29=5;
                }
                break;
            case 42:
                {
                alt29=6;
                }
                break;
            case 43:
                {
                alt29=7;
                }
                break;
            case 44:
                {
                alt29=8;
                }
                break;
            case 45:
                {
                alt29=9;
                }
                break;
            case 46:
                {
                alt29=10;
                }
                break;
            case 47:
                {
                alt29=11;
                }
                break;
            case 48:
                {
                alt29=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalItems.g:1057:3: (enumLiteral_0= 'EQUALITY' )
                    {
                    // InternalItems.g:1057:3: (enumLiteral_0= 'EQUALITY' )
                    // InternalItems.g:1058:4: enumLiteral_0= 'EQUALITY'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getEQUALITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelGroupFunctionAccess().getEQUALITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalItems.g:1065:3: (enumLiteral_1= 'AND' )
                    {
                    // InternalItems.g:1065:3: (enumLiteral_1= 'AND' )
                    // InternalItems.g:1066:4: enumLiteral_1= 'AND'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelGroupFunctionAccess().getANDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalItems.g:1073:3: (enumLiteral_2= 'OR' )
                    {
                    // InternalItems.g:1073:3: (enumLiteral_2= 'OR' )
                    // InternalItems.g:1074:4: enumLiteral_2= 'OR'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModelGroupFunctionAccess().getOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalItems.g:1081:3: (enumLiteral_3= 'NAND' )
                    {
                    // InternalItems.g:1081:3: (enumLiteral_3= 'NAND' )
                    // InternalItems.g:1082:4: enumLiteral_3= 'NAND'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getNANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModelGroupFunctionAccess().getNANDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalItems.g:1089:3: (enumLiteral_4= 'NOR' )
                    {
                    // InternalItems.g:1089:3: (enumLiteral_4= 'NOR' )
                    // InternalItems.g:1090:4: enumLiteral_4= 'NOR'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getNOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModelGroupFunctionAccess().getNOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalItems.g:1097:3: (enumLiteral_5= 'AVG' )
                    {
                    // InternalItems.g:1097:3: (enumLiteral_5= 'AVG' )
                    // InternalItems.g:1098:4: enumLiteral_5= 'AVG'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getAVGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getModelGroupFunctionAccess().getAVGEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalItems.g:1105:3: (enumLiteral_6= 'SUM' )
                    {
                    // InternalItems.g:1105:3: (enumLiteral_6= 'SUM' )
                    // InternalItems.g:1106:4: enumLiteral_6= 'SUM'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getSUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getModelGroupFunctionAccess().getSUMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalItems.g:1113:3: (enumLiteral_7= 'MAX' )
                    {
                    // InternalItems.g:1113:3: (enumLiteral_7= 'MAX' )
                    // InternalItems.g:1114:4: enumLiteral_7= 'MAX'
                    {
                    enumLiteral_7=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getMAXEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getModelGroupFunctionAccess().getMAXEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalItems.g:1121:3: (enumLiteral_8= 'MIN' )
                    {
                    // InternalItems.g:1121:3: (enumLiteral_8= 'MIN' )
                    // InternalItems.g:1122:4: enumLiteral_8= 'MIN'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getMINEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getModelGroupFunctionAccess().getMINEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalItems.g:1129:3: (enumLiteral_9= 'COUNT' )
                    {
                    // InternalItems.g:1129:3: (enumLiteral_9= 'COUNT' )
                    // InternalItems.g:1130:4: enumLiteral_9= 'COUNT'
                    {
                    enumLiteral_9=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getCOUNTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getModelGroupFunctionAccess().getCOUNTEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalItems.g:1137:3: (enumLiteral_10= 'LATEST' )
                    {
                    // InternalItems.g:1137:3: (enumLiteral_10= 'LATEST' )
                    // InternalItems.g:1138:4: enumLiteral_10= 'LATEST'
                    {
                    enumLiteral_10=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getLATESTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getModelGroupFunctionAccess().getLATESTEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalItems.g:1145:3: (enumLiteral_11= 'EARLIEST' )
                    {
                    // InternalItems.g:1145:3: (enumLiteral_11= 'EARLIEST' )
                    // InternalItems.g:1146:4: enumLiteral_11= 'EARLIEST'
                    {
                    enumLiteral_11=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getEARLIESTEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getModelGroupFunctionAccess().getEARLIESTEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleModelGroupFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001FFE80002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000029422L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000029402L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000029002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FFE00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001FFE000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});

}