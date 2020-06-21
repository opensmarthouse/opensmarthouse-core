/*
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.sitemap.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.openhab.core.model.sitemap.services.SitemapGrammarAccess;
import org.openhab.core.model.sitemap.sitemap.Chart;
import org.openhab.core.model.sitemap.sitemap.ColorArray;
import org.openhab.core.model.sitemap.sitemap.Colorpicker;
import org.openhab.core.model.sitemap.sitemap.Default;
import org.openhab.core.model.sitemap.sitemap.Frame;
import org.openhab.core.model.sitemap.sitemap.Group;
import org.openhab.core.model.sitemap.sitemap.Image;
import org.openhab.core.model.sitemap.sitemap.LinkableWidget;
import org.openhab.core.model.sitemap.sitemap.List;
import org.openhab.core.model.sitemap.sitemap.Mapping;
import org.openhab.core.model.sitemap.sitemap.Mapview;
import org.openhab.core.model.sitemap.sitemap.Selection;
import org.openhab.core.model.sitemap.sitemap.Setpoint;
import org.openhab.core.model.sitemap.sitemap.Sitemap;
import org.openhab.core.model.sitemap.sitemap.SitemapPackage;
import org.openhab.core.model.sitemap.sitemap.Slider;
import org.openhab.core.model.sitemap.sitemap.Switch;
import org.openhab.core.model.sitemap.sitemap.Text;
import org.openhab.core.model.sitemap.sitemap.Video;
import org.openhab.core.model.sitemap.sitemap.VisibilityRule;
import org.openhab.core.model.sitemap.sitemap.Webview;

@SuppressWarnings("all")
public abstract class AbstractSitemapSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SitemapGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SitemapPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SitemapPackage.CHART:
				sequence_Chart(context, (Chart) semanticObject); 
				return; 
			case SitemapPackage.COLOR_ARRAY:
				sequence_ColorArray(context, (ColorArray) semanticObject); 
				return; 
			case SitemapPackage.COLORPICKER:
				sequence_Colorpicker(context, (Colorpicker) semanticObject); 
				return; 
			case SitemapPackage.DEFAULT:
				sequence_Default(context, (Default) semanticObject); 
				return; 
			case SitemapPackage.FRAME:
				if (rule == grammarAccess.getFrameRule()) {
					sequence_Frame(context, (Frame) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWidgetRule()
						|| rule == grammarAccess.getLinkableWidgetRule()) {
					sequence_Frame_LinkableWidget(context, (Frame) semanticObject); 
					return; 
				}
				else break;
			case SitemapPackage.GROUP:
				if (rule == grammarAccess.getGroupRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWidgetRule()
						|| rule == grammarAccess.getLinkableWidgetRule()) {
					sequence_Group_LinkableWidget(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case SitemapPackage.IMAGE:
				if (rule == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWidgetRule()
						|| rule == grammarAccess.getLinkableWidgetRule()) {
					sequence_Image_LinkableWidget(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case SitemapPackage.LINKABLE_WIDGET:
				sequence_LinkableWidget(context, (LinkableWidget) semanticObject); 
				return; 
			case SitemapPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case SitemapPackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case SitemapPackage.MAPVIEW:
				sequence_Mapview(context, (Mapview) semanticObject); 
				return; 
			case SitemapPackage.SELECTION:
				sequence_Selection(context, (Selection) semanticObject); 
				return; 
			case SitemapPackage.SETPOINT:
				sequence_Setpoint(context, (Setpoint) semanticObject); 
				return; 
			case SitemapPackage.SITEMAP:
				sequence_Sitemap(context, (Sitemap) semanticObject); 
				return; 
			case SitemapPackage.SLIDER:
				sequence_Slider(context, (Slider) semanticObject); 
				return; 
			case SitemapPackage.SWITCH:
				sequence_Switch(context, (Switch) semanticObject); 
				return; 
			case SitemapPackage.TEXT:
				if (rule == grammarAccess.getWidgetRule()
						|| rule == grammarAccess.getLinkableWidgetRule()) {
					sequence_LinkableWidget_Text(context, (Text) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case SitemapPackage.VIDEO:
				sequence_Video(context, (Video) semanticObject); 
				return; 
			case SitemapPackage.VISIBILITY_RULE:
				sequence_VisibilityRule(context, (VisibilityRule) semanticObject); 
				return; 
			case SitemapPackage.WEBVIEW:
				sequence_Webview(context, (Webview) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Widget returns Chart
	 *     NonLinkableWidget returns Chart
	 *     Chart returns Chart
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         service=STRING | 
	 *         refresh=INT | 
	 *         period=ID | 
	 *         legend=BOOLEAN_OBJECT | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Chart(ISerializationContext context, Chart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColorArray returns ColorArray
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             item=ID? 
	 *             (
	 *                 condition='==' | 
	 *                 condition='>' | 
	 *                 condition='<' | 
	 *                 condition='>=' | 
	 *                 condition='<=' | 
	 *                 condition='!='
	 *             )? 
	 *             (sign='-' | sign='+')? 
	 *             state=XState
	 *         )? 
	 *         arg=STRING
	 *     )
	 */
	protected void sequence_ColorArray(ISerializationContext context, ColorArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Colorpicker
	 *     NonLinkableWidget returns Colorpicker
	 *     Colorpicker returns Colorpicker
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         frequency=INT | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Colorpicker(ISerializationContext context, Colorpicker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Default
	 *     NonLinkableWidget returns Default
	 *     Default returns Default
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         height=INT | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Default(ISerializationContext context, Default semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Frame returns Frame
	 *
	 * Constraint:
	 *     (
	 *         (item=ItemRef | label=ID | label=STRING | icon=Icon)? 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*)? 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*)? 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)?
	 *     )+
	 */
	protected void sequence_Frame(ISerializationContext context, Frame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Frame
	 *     LinkableWidget returns Frame
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (item=ItemRef | label=ID | label=STRING | icon=Icon)? 
	 *             (Visibility+=VisibilityRule Visibility+=VisibilityRule*)? 
	 *             (LabelColor+=ColorArray LabelColor+=ColorArray*)? 
	 *             (ValueColor+=ColorArray ValueColor+=ColorArray*)?
	 *         )+ 
	 *         children+=Widget*
	 *     )
	 */
	protected void sequence_Frame_LinkableWidget(ISerializationContext context, Frame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (
	 *         item=GroupItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Group
	 *     LinkableWidget returns Group
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             item=GroupItemRef | 
	 *             label=ID | 
	 *             label=STRING | 
	 *             icon=Icon | 
	 *             (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *             (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *             (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *         )+ 
	 *         children+=Widget*
	 *     )
	 */
	protected void sequence_Group_LinkableWidget(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Image returns Image
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         url=STRING | 
	 *         refresh=INT | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (IconColor+=ColorArray IconColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Image(ISerializationContext context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Image
	 *     LinkableWidget returns Image
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             item=ItemRef | 
	 *             label=ID | 
	 *             label=STRING | 
	 *             icon=Icon | 
	 *             url=STRING | 
	 *             refresh=INT | 
	 *             (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *             (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *             (IconColor+=ColorArray IconColor+=ColorArray*) | 
	 *             (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *         )+ 
	 *         children+=Widget*
	 *     )
	 */
	protected void sequence_Image_LinkableWidget(ISerializationContext context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns LinkableWidget
	 *     LinkableWidget returns LinkableWidget
	 *
	 * Constraint:
	 *     children+=Widget+
	 */
	protected void sequence_LinkableWidget(ISerializationContext context, LinkableWidget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Text
	 *     LinkableWidget returns Text
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (item=ItemRef | label=ID | label=STRING | icon=Icon)? 
	 *             (Visibility+=VisibilityRule Visibility+=VisibilityRule*)? 
	 *             (ValueColor+=ColorArray ValueColor+=ColorArray*)? 
	 *             (LabelColor+=ColorArray LabelColor+=ColorArray*)?
	 *         )+ 
	 *         children+=Widget*
	 *     )
	 */
	protected void sequence_LinkableWidget_Text(ISerializationContext context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns List
	 *     NonLinkableWidget returns List
	 *     List returns List
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         (icon=Icon? separator=STRING) | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (cmd=Command (label=ID | label=STRING))
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Mapview
	 *     NonLinkableWidget returns Mapview
	 *     Mapview returns Mapview
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         height=INT | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Mapview(ISerializationContext context, Mapview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Selection
	 *     NonLinkableWidget returns Selection
	 *     Selection returns Selection
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         (mappings+=Mapping mappings+=Mapping*) | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Selection(ISerializationContext context, Selection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Setpoint
	 *     NonLinkableWidget returns Setpoint
	 *     Setpoint returns Setpoint
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         minValue=Number | 
	 *         maxValue=Number | 
	 *         step=Number | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Setpoint(ISerializationContext context, Setpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SitemapModel returns Sitemap
	 *     Sitemap returns Sitemap
	 *
	 * Constraint:
	 *     (name=ID label=STRING? icon=STRING? children+=Widget+)
	 */
	protected void sequence_Sitemap(ISerializationContext context, Sitemap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Slider
	 *     NonLinkableWidget returns Slider
	 *     Slider returns Slider
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         frequency=INT | 
	 *         switchEnabled?='switchSupport' | 
	 *         minValue=Number | 
	 *         maxValue=Number | 
	 *         step=Number | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Slider(ISerializationContext context, Slider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Switch
	 *     NonLinkableWidget returns Switch
	 *     Switch returns Switch
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         (mappings+=Mapping mappings+=Mapping*) | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Switch(ISerializationContext context, Switch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (
	 *         (item=ItemRef | label=ID | label=STRING | icon=Icon)? 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*)? 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*)? 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)?
	 *     )+
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Video
	 *     NonLinkableWidget returns Video
	 *     Video returns Video
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         url=STRING | 
	 *         encoding=STRING | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Video(ISerializationContext context, Video semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VisibilityRule returns VisibilityRule
	 *
	 * Constraint:
	 *     (
	 *         item=ID 
	 *         (
	 *             condition='==' | 
	 *             condition='>' | 
	 *             condition='<' | 
	 *             condition='>=' | 
	 *             condition='<=' | 
	 *             condition='!='
	 *         ) 
	 *         (sign='-' | sign='+')? 
	 *         state=XState
	 *     )
	 */
	protected void sequence_VisibilityRule(ISerializationContext context, VisibilityRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Widget returns Webview
	 *     NonLinkableWidget returns Webview
	 *     Webview returns Webview
	 *
	 * Constraint:
	 *     (
	 *         item=ItemRef | 
	 *         label=ID | 
	 *         label=STRING | 
	 *         icon=Icon | 
	 *         height=INT | 
	 *         url=STRING | 
	 *         (LabelColor+=ColorArray LabelColor+=ColorArray*) | 
	 *         (ValueColor+=ColorArray ValueColor+=ColorArray*) | 
	 *         (Visibility+=VisibilityRule Visibility+=VisibilityRule*)
	 *     )+
	 */
	protected void sequence_Webview(ISerializationContext context, Webview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
