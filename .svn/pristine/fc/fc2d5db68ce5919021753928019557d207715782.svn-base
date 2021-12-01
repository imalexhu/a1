#push Test
java SorterClient pushValue 10 > testing/pushTest.txt
echo "Pop Push"
if ! diff -q testing/pushTest.txt testing/push.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success "; fi
echo
#pop test
java SorterClient pushValue 10 pop . > testing/popTest.txt
echo "Pop Test"
if ! diff -q testing/popTest.txt testing/pop.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#pop test
#ascending Test
java SorterClient pushValue 3 pushValue 2 pushValue 1 pushOperator descending . pop . pop . pop . > testing/descendingTest.txt
echo "descending Test"
if ! diff -q testing/descendingTest.txt testing/descending.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#pop test
#descending Test
java SorterClient pushValue 1 pushValue 2 pushValue 3 pushOperator ascending . pop . pop . pop . > testing/ascendingTest.txt
echo "ascending Test"
if ! diff -q testing/ascendingTest.txt testing/ascending.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#max Test
java SorterClient pushValue 3 pushValue 2 pushValue 1 pushOperator max . pop . > testing/maxTest.txt
echo "max Test"
if ! diff -q testing/maxTest.txt testing/max.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#min Test
java SorterClient pushValue 1 pushValue 2 pushValue 3 pushOperator min . pop . > testing/minTest.txt
echo "min Test"
if ! diff -q testing/minTest.txt testing/min.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#isEmpty Test
java SorterClient pushValue 10 isEmpty . pop . isEmpty > testing/isEmptyTest.txt
echo "isEmpty Test"
if ! diff -q testing/isEmptyTest.txt testing/isEmpty.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#delayPop Test
java SorterClient pushValue 10 delayPop 2500 > testing/delayPopTest.txt
echo "delayPop Test"
if ! diff -q testing/delayPopTest.txt testing/delayPop.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#difficult Test
java SorterClient isEmpty . pushValue 10 delayPop 2500 isEmpty . pushValue 3 pushValue 2 pushValue 1 pushOperator max pushValue 3 pushValue 2 pushValue 1 pushOperator descending pop . pop . pop .> testing/difficultTest.txt
echo "difficult Test"
if ! diff -q testing/difficultTest.txt testing/difficult.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo