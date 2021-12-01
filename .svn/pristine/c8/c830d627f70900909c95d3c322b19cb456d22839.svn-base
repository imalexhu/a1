java SorterClient pushValue 10 > testing/pushTest.txt &
java SorterClient pushValue 10 pop . > testing/popTest.txt &
java SorterClient pushValue 3 pushValue 2 pushValue 1 pushOperator descending . pop . pop . pop . > testing/descendingTest.txt &
java SorterClient pushValue 1 pushValue 2 pushValue 3 pushOperator ascending . pop . pop . pop . > testing/ascendingTest.txt &
java SorterClient pushValue 3 pushValue 2 pushValue 1 pushOperator max . pop . > testing/maxTest.txt &
java SorterClient pushValue 1 pushValue 2 pushValue 3 pushOperator min . pop . > testing/minTest.txt &
java SorterClient pushValue 10 isEmpty . pop . isEmpty > testing/isEmptyTest.txt &
java SorterClient pushValue 10 delayPop 2500 > testing/delayPopTest.txt &
java SorterClient isEmpty . pushValue 10 delayPop 2500 isEmpty . pushValue 3 pushValue 2 pushValue 1 pushOperator max pushValue 3 pushValue 2 pushValue 1 pushOperator descending pop . pop . pop .> testing/difficultTest.txt

wait;

#push Test
echo "Pop Push"
if ! diff -q testing/pushTest.txt testing/push.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success "; fi
echo
#pop test
echo "Pop Test"
if ! diff -q testing/popTest.txt testing/pop.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#pop test
#ascending Test
echo "descending Test"
if ! diff -q testing/descendingTest.txt testing/descending.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#pop test
#descending Test
echo "ascending Test"
if ! diff -q testing/ascendingTest.txt testing/ascending.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#max Test
echo "max Test"
if ! diff -q testing/maxTest.txt testing/max.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#min Test
echo "min Test"
if ! diff -q testing/minTest.txt testing/min.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#isEmpty Test
echo "isEmpty Test"
if ! diff -q testing/isEmptyTest.txt testing/isEmpty.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#delayPop Test
echo "delayPop Test"
if ! diff -q testing/delayPopTest.txt testing/delayPop.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo
#diffuclt Test
echo "difficult Test"
if ! diff -q testing/difficultTest.txt testing/difficult.txt &>/dev/null; then   >&2 echo "Failed"; else echo "Success"; fi
echo