package com.github.dataanon.strategy.string

import com.github.dataanon.model.Field
import com.github.dataanon.model.Record
import com.github.dataanon.strategy.AnonymizationStrategy

val DEFAULT_TEXT        =   """
                              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed quis nulla quis ligula bibendum dignissim. Nullam elementum convallis mauris, at ultrices odio dignissim dapibus. Etiam vitae neque lorem, a luctus purus. In at diam mi, sit amet dapibus magna. Maecenas tincidunt tortor id dolor tristique dictum. Morbi pulvinar odio ut lorem gravida ac varius orci ultrices. Nulla id arcu dui, sit amet commodo augue. Curabitur elit elit, semper quis tincidunt at, auctor et tortor.
                              Quisque ut enim arcu. Praesent orci mi, tincidunt non sodales a, blandit ac nunc. Phasellus sed erat a nibh suscipit molestie sed a augue. Aliquam pretium ultricies nibh. Sed sit amet accumsan sapien. Pellentesque urna orci, iaculis eu lacinia ac, consequat vel elit. Suspendisse aliquet tortor et urna varius non ullamcorper augue tempus. Phasellus pretium, nulla eu adipiscing viverra, purus est fermentum enim, ut fringilla ligula lectus quis est. Phasellus quis scelerisque ligula. Cras accumsan lobortis egestas. Ut quis orci sem, sed gravida orci.
                              Vestibulum eget odio nisl, nec ornare ante. Aenean tristique, nisl eget lacinia aliquam, neque lectus lacinia enim, id ullamcorper nisl lorem vitae enim. Sed vulputate condimentum convallis. Ut viverra tincidunt arcu ac egestas. Quisque ut neque nec quam suscipit ornare a ornare est. Nulla facilisi. Mauris facilisis eleifend neque eget egestas. Vestibulum egestas dui eleifend urna pharetra a hendrerit quam sagittis. Duis ut turpis convallis diam interdum congue. In hac habitasse platea dictumst. Nulla a erat eget tortor tempor consectetur. Fusce euismod congue risus in feugiat. Sed rutrum vehicula lectus et vehicula. In porttitor malesuada sem at auctor.
                              Maecenas lacinia placerat augue quis posuere. Cras eu augue quam, eu malesuada sem. Proin facilisis iaculis lectus, vel hendrerit nulla tristique quis. Donec risus mauris, vulputate tristique feugiat nec, imperdiet sed sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean vitae aliquam magna. Donec tempor, ipsum non dapibus elementum, est sem hendrerit nulla, scelerisque sollicitudin lacus mauris eu libero. Vivamus turpis justo, ullamcorper sed ullamcorper quis, tempor in elit. Sed nisl erat, laoreet at adipiscing quis, lobortis et est. Duis congue iaculis mollis. Curabitur ligula turpis, malesuada non feugiat vitae, ullamcorper non nibh. Aliquam adipiscing pellentesque leo nec molestie. Donec tempor eleifend libero, at rutrum velit semper a. Sed tincidunt dictum lorem eu egestas.
                              Sed at iaculis risus. Nulla aliquet vulputate nulla, nec euismod sem porta quis. Aliquam erat volutpat. Sed tincidunt pharetra metus, in facilisis nunc suscipit ut. Nunc placerat vulputate sapien, elementum varius mi viverra eget. Nam hendrerit felis et arcu ultrices vehicula. Phasellus condimentum ornare orci sed placerat. Sed vel rutrum lorem. Fusce id bibendum ipsum.
                            """.trimIndent()

val DEFAULT_TEXT_LENGTH = DEFAULT_TEXT.length

class LoremIpsum : AnonymizationStrategy<String> {

    override fun anonymize(field: Field<String>, record: Record): String = DEFAULT_TEXT.substring(0, if (field.oldValue.length > DEFAULT_TEXT_LENGTH) DEFAULT_TEXT_LENGTH else field.oldValue.length)
}